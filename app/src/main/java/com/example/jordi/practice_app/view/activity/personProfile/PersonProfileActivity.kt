package com.example.jordi.practice_app.view.activity.personProfile

import android.os.Bundle
import com.example.jordi.practice_app.R
import com.example.jordi.practice_app.extensions.hideMe
import com.example.jordi.practice_app.extensions.showMe
import com.example.jordi.practice_app.presenter.personProfile.PersonProfilePresenter
import com.example.jordi.practice_app.view.activity.RootActivity
import com.example.jordi.practice_app.view.custom.toolbar.ToolbarView
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import kotlinx.android.synthetic.main.view_progress.*
import kotlinx.android.synthetic.main.view_toolbar.*

class PersonProfileActivity : RootActivity<PersonProfilePresenter.View>(), PersonProfilePresenter.View {

    companion object {
        const val PERSON_NAME_KEY = "PERSON_NAME_KEY"
        const val BIRTH_AGE_KEY = "BIRTH_AGE_KEY"
        const val SEX_KEY = "SEX_KEY"
        const val PHOTO_PATH_KEY = "PHOTO_PATH_KEY"
        const val CIVIL_STATE_KEY = "CIVIL_STATE_KEY"
        const val DESCRIPTION_KEY = "DESCRIPTION_KEY"
    }

    override val presenter: PersonProfilePresenter by instance()

    override val layoutResourceId: Int = R.layout.activity_home

    override val toolbar: ToolbarView by lazy { toolbarView }

    override val activityModule: Kodein.Module = Kodein.Module {
        bind<PersonProfilePresenter>() with provider {
            PersonProfilePresenter(
                    errorHandler = instance(),
                    view = this@PersonProfileActivity)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun showProgress() {
        progress.showMe()
    }

    override fun hideProgress() {
        progress.hideMe()
    }

    override fun initializeUI() {
        val toolbarTitle = getString(R.string.toolbar_name)
        toolbarView.showToolbar(ToolbarView.Type.BACK_EDIT, toolbarTitle)
    }

    override fun registerListeners() {

    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
