package com.example.jordi.practice_app.view.activity.home

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.widget.DrawerLayout
import com.example.jordi.practice_app.R
import com.example.jordi.practice_app.R.id.*
import com.example.jordi.practice_app.extensions.hideMe
import com.example.jordi.practice_app.extensions.showMe
import com.example.jordi.practice_app.model.Screen
import com.example.jordi.practice_app.presenter.home.HomePresenter
import com.example.jordi.practice_app.view.activity.MenuActivity
import com.example.jordi.practice_app.view.activity.RootActivity
import com.example.jordi.practice_app.view.custom.toolbar.ToolbarView
import com.example.jordi.practice_app.view.navigation.NavigationView
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.view_navigation.*
import kotlinx.android.synthetic.main.view_progress.*
import kotlinx.android.synthetic.main.view_toolbar.*

class HomeActivity : MenuActivity<HomePresenter.View>(), HomePresenter.View {

    override val presenter: HomePresenter by instance()

    override val layoutResourceId: Int = R.layout.activity_home

    override val menu: NavigationView by lazy { navView }

    override val drawer: DrawerLayout by lazy { drawerLayout }

    override val toolbar: ToolbarView by lazy { toolbarView }

    override val currentScreen: Screen = Screen.HOME

    override val activityModule: Kodein.Module = Kodein.Module {
        bind<HomePresenter>() with provider {
            HomePresenter(
                    errorHandler = instance(),
                    view = this@HomeActivity)
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
        toolbarView.showToolbar(ToolbarView.Type.MENU_SEARCH_ADD, toolbarTitle)
    }

    override fun registerListeners() {
        super.registerListeners()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
