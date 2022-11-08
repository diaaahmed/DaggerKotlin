package com.kotlin.daggerkotlin

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent
//@Component(modules = [SugarModule::class])
interface CoffeeComponent
{
    fun getCoffee():Coffee

    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder
    {
        @BindsInstance
        fun sugar(@SugarAnnotation sugar:Int):Builder

        @BindsInstance
        fun milk(@MilkAnnotation milk:Int):Builder

       //fun appComponent(appComponent: AppComponent):Builder

        fun build():CoffeeComponent
    }
}