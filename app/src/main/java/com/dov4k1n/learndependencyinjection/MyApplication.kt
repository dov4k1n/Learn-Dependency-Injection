package com.dov4k1n.learndependencyinjection

import android.app.Application
import com.dov4k1n.learndependencyinjection.di.AppComponent
import com.dov4k1n.learndependencyinjection.di.DaggerAppComponent

class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}