package com.dov4k1n.learndependencyinjection.di

import com.dov4k1n.learndependencyinjection.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}