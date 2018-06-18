package com.example.jordi.practice_app.presenter

import com.example.jordi.practice_app.error.ErrorHandler
import com.example.jordi.practice_app.model.PersonView
import com.example.jordi.practice_app.model.Screen

abstract class MenuPresenter<out T : MenuPresenter.View>(errorHandler: ErrorHandler,
                                                         view: T)
    : Presenter<T>(errorHandler, view) {

    override fun initialize() {

    }

    override fun resume() {
        getUser()
    }

    override fun destroy() {

    }

    private fun getUser() {
        view.showUser()
    }

    fun onStaticMenuItemClicked(screen: Screen) {
        view.closeMenu()
        when (screen) {
            Screen.HOME ->view.navigateToHome()
            Screen.PROFILE -> view.navigateToProfile()
            Screen.SETTINGS -> view.navigateToSettings()
        }
    }

    interface View : Presenter.View {
        fun showUser()

        fun navigateToHome()
        fun navigateToProfile()
        fun navigateToCatched()
        fun navigateToSettings()

        fun closeMenu()
    }
}