package com.tobibur.daggersample.di.modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AndroidModule(private val application: Application){

    @Provides
    fun provideApplicationContext() : Context = application
}