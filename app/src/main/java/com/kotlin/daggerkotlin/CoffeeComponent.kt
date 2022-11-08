package com.kotlin.daggerkotlin

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [AppComponent::class])
//@Component(modules = [SugarModule::class])
interface CoffeeComponent
{
    fun getCoffee():Coffee

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun sugar(@SugarAnnotation sugar:Int):Builder

        @BindsInstance
        fun milk(@MilkAnnotation milk:Int):Builder

       fun appComponent(appComponent: AppComponent):Builder

        fun build():CoffeeComponent
    }
}