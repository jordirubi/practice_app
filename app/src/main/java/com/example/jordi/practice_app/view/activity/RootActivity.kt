package com.example.jordi.practice_app.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinInjected
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.lazy
import com.example.jordi.practice_app.extensions.toast
import com.example.jordi.practice_app.presenter.Presenter
import com.example.jordi.practice_app.view.App
import com.example.jordi.practice_app.view.custom.toolbar.ToolbarView

/**
 * RootActivity.
 */
abstract class RootActivity<out V : Presenter.View> : AppCompatActivity(), KodeinInjected, Presenter.View {

    abstract val presenter: Presenter<V>

    abstract val layoutResourceId: Int

    abstract val toolbar: ToolbarView

    override val injector = KodeinInjector()

    abstract val activityModule: Kodein.Module

    val kodein by Kodein.lazy {
        extend((application as App).kodein)
        import(activityModule)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResourceId)

        initializeDI()
        initializeUI()
        registerListeners()

        presenter.initialize()
    }

    override fun onResume() {
        super.onResume()
        presenter.resume()
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    private fun initializeDI() {
        inject(kodein)
    }

    abstract fun initializeUI()

    abstract fun registerListeners()

    override fun showError(error: String) {
        toast(error)
    }

    override fun showError(errorId: Int) {
        toast(errorId)
    }

    override fun showMessage(message: String) {
        toast(message, Toast.LENGTH_SHORT)
    }

    override fun showMessage(messageId: Int) {
        toast(messageId, Toast.LENGTH_SHORT)
    }
}