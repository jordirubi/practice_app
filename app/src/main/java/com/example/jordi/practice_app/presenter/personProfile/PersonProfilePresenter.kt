package com.example.jordi.practice_app.presenter.personProfile

import com.example.jordi.practice_app.error.ErrorHandler
import com.example.jordi.practice_app.presenter.Presenter

class PersonProfilePresenter(errorHandler: ErrorHandler,
                    view: PersonProfilePresenter.View)
    : Presenter<PersonProfilePresenter.View>(errorHandler, view) {

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