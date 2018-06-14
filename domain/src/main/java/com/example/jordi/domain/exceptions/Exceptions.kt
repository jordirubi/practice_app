package com.example.jordi.domain.exceptions

/**
 * ServerException
 */
class ServerException : Exception()

class ConnectionException : Exception()

class NoLanguageException : Exception()

class NoMoreItemsException : Exception()

class ThereIsNoMatchException : Exception()

class NonFatalException(val throwable: Throwable, message: String) : Exception(message)