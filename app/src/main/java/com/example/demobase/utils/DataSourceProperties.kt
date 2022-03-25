package com.example.demobase.utils

object DataSourceProperties {
    fun getUrl(): String {
        return SERVER_URL

    }

    fun getDomain(): String {
        return DOMAIN
    }

    fun getKeyvaultUrl(): String {
        return SERVER_KEY_VAULT_URL
    }

    fun getKeyvaultDomain(): String {
        return KEY_VAULT_DOMAIN

    }

    fun getPassword(): String{
        return PASSWORD_TEST
    }

    fun getUser(): String{
        return USER_TEST
    }

    fun getCerts(): List<String> {
        val list = arrayListOf<String>()
        //Test
        list.add("aQhQhLXHmIi1sLVnl7x1gPFF5wDXJjcHSdyauPUzRTY=")
        list.add("IQBnNBEiFuhj+8x6X8XLgh01V9Ic5/V3IRQLNFFc7v4=")
        list.add("K87oWBWM9UZfyddvDfoxL+8lpNyoUB2ptGtn0fv6G2Q=")
        list.add("u68khmo+xM48N0peRm5dmH8mHeqns8Nxi1DQJPgS2Uw=")
        list.add("YLh1dUR9y6Kja30RrAn7JKnbQG/uEtLMkBgFF2Fuihg=")
        list.add("Vjs8r4z+80wjNcr1YKepWQboSIRi63WsWXhIMN+eWys=")

        //Live
        list.add("OVTGlKpbZoo+HAbq+hXtZKkDzh9bKi0hOPleibz4kR4=")
        list.add("IQBnNBEiFuhj+8x6X8XLgh01V9Ic5/V3IRQLNFFc7v4=")
        list.add("K87oWBWM9UZfyddvDfoxL+8lpNyoUB2ptGtn0fv6G2Q=")
        list.add("QWciwX5xlXcnaxamEN5m0ucCFujzX6ZZGkqyRseyx0g=")
        list.add("grhpCL9UPvrUI7oUnr79NCpSVGMG8T+zrYxPjaqiXio=")
        list.add("hETpgVvaLC0bvcGG3t0cuqiHvr4XyP2MTwCiqhgRWwU=")
        list.add("cGuxAXyFXFkWm61cF4HPWX8S0srS9j0aSqN0k4AP+4A=")
        list.add("Nk9YvHOW7YAoCPBaabZ1eJLlPyLZimHByAO5yFAaMO4=")
        return list
    }

    const val CERT = "IU4rxDPU9WSxWfG860OJpAZ84Y0KrBBKUYYM8r0m+CA="


    private const val SERVER_URL_LIVE = "https://spos-api.vnpay.vn/"
    private const val DOMAIN_LIVE = "spos-api.vnpay.vn"

    private const val SERVER_URL = "https://spos-api.vnpaytest.vn/"
    const val DOMAIN = "spos-api.vnpaytest.vn"

    private const val SERVER_URL_UAT = "https://smartpos3api.vnpaytest.vn/"
    const val DOMAIN_UAT = "smartpos3api.vnpaytest.vn"

    private const val SERVER_KEY_VAULT_URL = "https://demomb.vnpay.vn:20157/"
    private const val KEY_VAULT_DOMAIN = "demomb.vnpay.vn"

    private const val SERVER_KEY_VAULT_URL_LIVE = "https://sposvault.vnpay.vn/"
    private const val KEY_VAULT_DOMAIN_LIVE = "sposvault.vnpay.vn"

    private const val PASSWORD_TEST = "Qwerty1!"
    private const val PASSWORD_LIVE= "vuong@8294"

    private const val USER_TEST = "t2p_app@email.com"
    private const val USER_LIVE = "vuongnm@vnpay.vn"

    const val TIMEOUT_CONNECT: Long = 60000
    const val TIMEOUT_READ: Long = 60000
    const val TIME_WRITE: Long = 60000
}