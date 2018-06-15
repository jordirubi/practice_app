package com.example.jordi.practice_app.view.navigation

import android.content.Context
import android.support.design.widget.NavigationView
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import com.example.jordi.practice_app.R
import com.example.jordi.practice_app.model.PersonView
import com.example.jordi.practice_app.model.Screen
import com.example.jordi.practice_app.model.StaticMenuItemView
import com.example.jordi.practice_app.view.adapter.menu.StaticMenuItemsAdapter
import kotlinx.android.synthetic.main.view_navigation.view.*
import kotlinx.android.synthetic.main.view_navigation_header.view.*

class NavigationView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : NavigationView(context, attrs, defStyleAttr) {

    private var onStaticMenuItemClick: ((Screen) -> Unit)? = null

    private val staticAdapter = StaticMenuItemsAdapter(onItemClickListener = { onStaticMenuItemClick?.invoke(it.screen) })

    fun setStaticMenuItemsListener(onStaticMenuItemClick: (Screen) -> Unit) {
        this.onStaticMenuItemClick = onStaticMenuItemClick

        staticAdapter.addAll(menuItems())

        staticItems.adapter = staticAdapter
        staticItems.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        staticItems.isNestedScrollingEnabled = false
    }


    private fun menuItems(): MutableList<StaticMenuItemView> {
        val items = mutableListOf<StaticMenuItemView>()

        items.add(StaticMenuItemView(screen = Screen.HOME, iconId = R.drawable.ic_home, nameId = R.string.home_item))
        items.add(StaticMenuItemView(screen = Screen.PROFILE, iconId = R.drawable.ic_profile, nameId = R.string.profile_item))
        items.add(StaticMenuItemView(screen = Screen.CATCHED, iconId = R.drawable.ic_pokeball, nameId = R.string.catched_item))
        items.add(StaticMenuItemView(screen = Screen.SETTINGS, iconId = R.drawable.ic_settings, nameId = R.string.settings_item))

        return items
    }

    fun showUser() {
        username.text = "Jordi Rubiralta"
        birthYear.text = "1996"
    }

}