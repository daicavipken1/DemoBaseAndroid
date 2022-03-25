package com.example.demobase

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val a  = 0.1
        val b  = 0.2
        val c  = 0.3
        val s: Boolean = a+b==c
        println(a+b)
        println(b)
        println(c)
        assertEquals(true, s)
    }
}