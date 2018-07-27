package com.tobibur.daggersample.di

import android.support.v7.app.AppCompatActivity
import com.tobibur.daggersample.Application

//fun AppCompatActivity.component() : ApplicationComponent =  (application as Application).component

val AppCompatActivity.component : ApplicationComponent
        get() =  (application as Application).component