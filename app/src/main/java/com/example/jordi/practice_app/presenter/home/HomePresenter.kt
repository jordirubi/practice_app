package com.example.jordi.practice_app.presenter.home

import com.example.jordi.practice_app.error.ErrorHandler
import com.example.jordi.practice_app.presenter.MenuPresenter

class HomePresenter(errorHandler: ErrorHandler,
                    view: HomePresenter.View)
    : MenuPresenter<HomePresenter.View>(errorHandler, view) {

    override fun initialize() {
        super.initialize()
    }

    override fun resume() {
        super.resume()

    }

    override fun stop() {
    }

    override fun destroy() {

    }

    interface View: MenuPresenter.View {

    }
}