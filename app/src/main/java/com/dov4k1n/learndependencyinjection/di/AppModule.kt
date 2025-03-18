package com.dov4k1n.learndependencyinjection.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideSomeDependency(): String {
        return "Hello from Dagger!"
    }
}