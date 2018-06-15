package com.example.jordi.practice_app.view.activity

import android.support.v4.widget.DrawerLayout
import android.view.Gravity.START
import android.view.View
import com.example.jordi.practice_app.model.PersonView
import com.example.jordi.practice_app.model.Screen
import com.example.jordi.practice_app.navigator.*
import com.example.jordi.practice_app.presenter.MenuPresenter
import com.example.jordi.practice_app.view.custom.toolbar.ToolbarView
import com.example.jordi.practice_app.view.navigation.NavigationView
import kotlinx.android.synthetic.main.view_toolbar.view.*


abstract class MenuActivity<out V : MenuPresenter.View> : RootActivity<MenuPresenter.View>(), MenuPresenter.View {

    abstract override val presenter: MenuPresenter<V>

    abstract val menu: NavigationView

    abstract val drawer: DrawerLayout

    abstract val currentScreen: Screen

    abstract val toolbar: ToolbarView

    private val drawerOpeningListener = object : DrawerLayout.SimpleDrawerListener() {
        override fun onDrawerOpened(drawerView: View?) {
            super.onDrawerOpened(drawerView)
        }
    }

    override fun registerListeners() {
        menu.setStaticMenuItemsListener { presenter.onStaticMenuItemClicked(it) }
        toolbar.toggleDrawer.setOnClickListener { drawer.openDrawer(START) }
        drawer.addDrawerListener(drawerOpeningListener)
    }

    override fun navigateToHome() {
        if (currentScreen != Screen.HOME) {
            navigateToHomeActivity(this)
        }
    }

    override fun navigateToProfile() {
        if (currentScreen != Screen.PROFILE) {
            navigateToProfileActivity(this)
        }
    }

    override fun navigateToCatched() {
        if (currentScreen != Screen.CATCHED) {
            navigateToSettingsActivity(this)
        }
    }

    override fun navigateToSettings() {
        if (currentScreen != Screen.SETTINGS) {
            navigateToSettingsActivity(this)
        }
    }

    override fun closeMenu() {
        drawer.closeDrawers()
    }

    override fun showUser() {
        menu.showUser()
    }

}