package com.example.test.interfaces

interface Numbers {
    fun sum()
    fun dev()

    class Base ():Numbers {
        override fun sum() {

        }

        override fun dev() {

        }
    }
}