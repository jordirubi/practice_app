package com.example.jordi.practice_app.error


import android.content.Context

/**
 * ErrorHandler.
 */
interface ErrorHandler {
    fun convert(e: Exception): String
}


class ErrorHandlerImpl(private val context: Context) : ErrorHandler {
    override fun convert(e: java.lang.Exception): String = "Error"
}