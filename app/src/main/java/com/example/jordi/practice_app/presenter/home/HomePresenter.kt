package com.example.jordi.practice_app.presenter.home

import com.example.jordi.practice_app.error.ErrorHandler
import com.example.jordi.practice_app.presenter.Presenter

class HomePresenter(errorHandler: ErrorHandler,
                    view: HomePresenter.View)
    : Presenter<HomePresenter.View>(errorHandler, view) {

    override fun initialize() {

    }

    override fun resume() {

    }

    override fun stop() {
    }

    override fun destroy() {

    }

    interface View: Presenter.View {

    }
}