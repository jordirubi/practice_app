package com.example.jordi.practice_app.di

import android.content.Context
import com.example.jordi.domain.executor.Executor
import com.example.jordi.practice_app.error.ErrorHandler
import com.example.jordi.practice_app.error.ErrorHandlerImpl
import com.example.jordi.practice_app.executor.RxExecutor
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.singleton

/**
 * Modules
 */
fun appModule(context: Context) = Kodein.Module {
    bind<Context>() with singleton { context }
    bind<Executor>() with singleton { RxExecutor() }
    bind<ErrorHandler>() with singleton { ErrorHandlerImpl(context = instance()) }

}

val domainModule = Kodein.Module {

}

val dataModule = Kodein.Module {

}