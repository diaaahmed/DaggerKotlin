package com.kotlin.daggerkotlin

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [SugarModule::class])
interface AppComponent
{

    fun getCoffeeComponentBuilder():CoffeeComponent.Builder

}