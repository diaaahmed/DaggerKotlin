package com.kotlin.daggerkotlin

import android.app.Application

class MyApplication:Application()
{
    companion object{
        val component by lazy{
//            DaggerCoffeeComponent.builder().sugar(74)
//                .milk(50).build()

            DaggerAppComponent.create()
        }
        //lateinit var component: CoffeeComponent

    }
    override fun onCreate() {
        super.onCreate()

//        component = DaggerCoffeeComponent.builder().sugar(74)
//             .milk(50).build()
    }


}