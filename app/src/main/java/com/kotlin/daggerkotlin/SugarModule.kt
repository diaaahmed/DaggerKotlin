package com.kotlin.daggerkotlin

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SugarModule() {

//    @Provides
//    fun provideCapacity():Int{
//        return num
//    }

    @Singleton
    @Provides
    fun provideSugar():Sugar{
        return Sugar()
    }
}