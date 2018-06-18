package com.example.jordi.practice_app.view.custom.toolbar

import android.content.Context
import android.support.v7.widget.Toolbar
import android.util.AttributeSet
import com.example.jordi.practice_app.extensions.hideMe
import com.example.jordi.practice_app.extensions.showMe
import kotlinx.android.synthetic.main.view_toolbar.view.*

class ToolbarView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : Toolbar(context, attrs, defStyleAttr) {

    override fun onFinishInflate() {
        super.onFinishInflate()

    }

    fun showToolbar(type: ToolbarView.Type, title: String) {
        when (type) {
            ToolbarView.Type.MENU_SEARCH_ADD -> showMenuSearchAddToolbar()
            ToolbarView.Type.BACK_EDIT -> showBackEditToolbar()
        }

        setTitle(title)
    }

    fun setTitle(title: String) {
        toolbarTitle.text = title.toUpperCase()
    }

    private fun showMenuSearchAddToolbar() {
        toggleDrawer.showMe()
        toolbarTitle.showMe()
        search.showMe()
        add.showMe()


        back.hideMe()
    }

    private fun showBackEditToolbar() {
        back.showMe()

        toggleDrawer.hideMe()
        toolbarTitle.hideMe()
        search.hideMe()
        add.hideMe()
    }

    enum class Type {
        MENU_SEARCH_ADD, BACK_EDIT
    }
}

