package com.tobibur.daggersample.di

import com.tobibur.daggersample.MainActivity
import com.tobibur.daggersample.di.modules.AndroidModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidModule::class))
interface ApplicationComponent{

    fun inject(activity : MainActivity)
}