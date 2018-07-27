package com.tobibur.daggersample

import android.app.Application
import com.tobibur.daggersample.di.ApplicationComponent
import com.tobibur.daggersample.di.DaggerApplicationComponent
import com.tobibur.daggersample.di.modules.AndroidModule

class Application : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .androidModule(AndroidModule(this))
                .build()
    }
}