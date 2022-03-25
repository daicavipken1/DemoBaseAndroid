package com.example.demobase.di

import android.content.Context
import com.example.demobase.utils.DataSourceProperties
import com.example.demobase.network.SSLInterceptor
import okhttp3.Cache
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import org.koin.dsl.module
import java.util.concurrent.TimeUnit
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.HttpsURLConnection
import javax.net.ssl.SSLSession

val networkModule = module {
    single { createHostname(DataSourceProperties.getDomain(), DataSourceProperties.getKeyvaultDomain()) }
    single { createCertificatePinner(DataSourceProperties.getDomain(), DataSourceProperties.getKeyvaultDomain()) }
    single { createOkHttpCache(get()) }
    single { createOkHttpClient(get(), get(), get()) }

}

fun createOkHttpClient(
    cache: Cache,
    hostname: HostnameVerifier,
    certificatePinner: CertificatePinner
): OkHttpClient {

    return OkHttpClient.Builder()
        .cache(cache)
        .hostnameVerifier(hostname)
        .certificatePinner(certificatePinner)
        .build()
}

fun createHostname(domain: String,domainKeyvault:String): HostnameVerifier {
    return VerifyHostName(domain,domainKeyvault)
}

fun createOkHttpCache(context: Context): Cache {
    return Cache(context.cacheDir, Long.MAX_VALUE)
}

fun createCertificatePinner(domain: String,domainKeyvault:String): CertificatePinner {
    return CertificatePinner.Builder()
        .apply {
            repeat(DataSourceProperties.getCerts().size) {
                add(domain, "sha256/${DataSourceProperties.getCerts()[it]}")
                add(domainKeyvault, "sha256/${DataSourceProperties.getCerts()[it]}")
            }
        }
        .build()
}

fun newBuildOkHttp(client: OkHttpClient,
                   timeoutConnect: Long,
                   timeoutReader: Long): OkHttpClient{

    return client.newBuilder()
        .callTimeout(timeoutConnect * 2, TimeUnit.MILLISECONDS)
        .connectTimeout(timeoutConnect, TimeUnit.MILLISECONDS)
        .addInterceptor(SSLInterceptor())
        .retryOnConnectionFailure(false)
        .readTimeout(timeoutReader * 2, TimeUnit.MILLISECONDS)
        .writeTimeout(timeoutReader * 2, TimeUnit.MILLISECONDS)
        .build()
}

class VerifyHostName(var hn: String,var hn2 :String) : HostnameVerifier {
    override fun verify(hostname: String, session: SSLSession): Boolean {
        val hv = HttpsURLConnection.getDefaultHostnameVerifier()
        return (hv.verify(hn, session) && hn == hostname) || (hv.verify(hn2, session) && hn2 == hostname)
    }
}