package com.example.jordi.practice_app.presenter

import com.crashlytics.android.Crashlytics
import com.example.jordi.domain.exceptions.NonFatalException
import com.example.jordi.practice_app.error.ErrorHandler
import java.lang.Exception

/**
 * Presenter.
 */
abstract class Presenter<out V : Presenter.View>(protected val errorHandler: ErrorHandler, val view: V) {

    abstract fun initialize()

    abstract fun resume()

    abstract fun stop()

    abstract fun destroy()

    protected fun onError(callback: (String) -> Unit): (Throwable) -> Unit = {
        view.hideProgress()

        val message = errorHandler.convert(it as Exception)

        Crashlytics.logException(NonFatalException(it, message))
        callback(message)
    }

    interface View {
        fun showProgress()

        fun hideProgress()

        fun showError(error: String)

        fun showError(errorId: Int)

        fun showMessage(message: String)

        fun showMessage(messageId: Int)
    }
}