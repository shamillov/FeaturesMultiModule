package com.shamilov.multimoduleexample

import android.app.Application
import com.shamilov.common.di.ApplicationWrapper
import com.shamilov.common.di.ComponentFactory
import com.shamilov.multimoduleexample.di.DaggerApplicationComponent
import javax.inject.Inject

class App : Application(), ApplicationWrapper {

    @Inject
    override lateinit var componentFactory: ComponentFactory

    override fun onCreate() {
        super.onCreate()

        initDI()
    }

    private fun initDI() {
        DaggerApplicationComponent
            .factory()
            .create(applicationContext)
            .inject(this)
    }
}