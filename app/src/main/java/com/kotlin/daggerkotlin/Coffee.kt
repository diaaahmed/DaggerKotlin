package com.kotlin.daggerkotlin

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton
import kotlin.properties.Delegates

// constructor injection


@ActivityScope
//@Singleton
class Coffee: Engine {

    // Field injection
    @set:Inject
    var farm = Farm()

    @set:Inject
    var river = River()

    val capacity:Int

    val milk:Int

    var sugar = Sugar()

    @Inject
    constructor(@SugarAnnotation capacity:Int, @MilkAnnotation milk:Int, sugar:Sugar)
    {
        this.capacity = capacity
        this.milk = milk
        this.sugar = sugar
    }


    fun getCoffeeCup():String = "${farm.getBeans()} ${river.getWater()} ${sugar.getSugar()} $capacity $milk"

    // Method injection
    @Inject
    fun connectElectricity(){
        Log.d("TAG", "connectElectricity: Done")
    }
}