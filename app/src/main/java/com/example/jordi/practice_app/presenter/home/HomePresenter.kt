package com.example.jordi.practice_app.presenter.home

import com.example.jordi.domain.constants.Civil_state
import com.example.jordi.domain.constants.Sex
import com.example.jordi.practice_app.error.ErrorHandler
import com.example.jordi.practice_app.model.PersonView
import com.example.jordi.practice_app.presenter.MenuPresenter

class HomePresenter(errorHandler: ErrorHandler,
                    view: HomePresenter.View)
    : MenuPresenter<HomePresenter.View>(errorHandler, view) {

    override fun initialize() {
        showPeople()
    }

    override fun resume() {
        super.resume()
    }

    override fun stop() {
    }

    override fun destroy() {

    }

    private fun showPeople() {
        view.hideProgress()
        view.showPeopleList()
    }

    fun onPersonClicked(personView: PersonView) {
        view.navigateToPersonProfile(personView)
    }

    interface View: MenuPresenter.View {
        fun navigateToPersonProfile(personView: PersonView)
        fun showPeopleList()
    }
}