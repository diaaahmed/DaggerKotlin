package com.kotlin.daggerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import dagger.internal.DaggerGenerated
import javax.inject.Inject

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component = DaggerCoffeeComponent.builder().coffeeModule(CoffeeModule(2))
//            .build()
        //val component = DaggerCoffeeComponent.builder().coffeeModule(CoffeeModule(74)).build()
//        val component = DaggerCoffeeComponent.builder().sugar(74)
//            .milk(50).build()
//        component.inject(this)
        //component.getCoffee().getCoffeeCup()

      // val appComponent = MyApplication.component

//        val coffeeComponent = DaggerCoffeeComponent.builder().milk(4).appComponent(appComponent)
//            .sugar(4).build()

         val appComponent = MyApplication.component

        val coffeeComponent = DaggerCoffeeComponent.builder().milk(4)
            .appComponent(appComponent)
            .sugar(4).build()

        coffeeComponent.inject(this)

        Log.d(TAG, "diaa coffe1 sugar ${coffee.river} \n " +
                "diaa coffe2 sugar ${coffee2.river} \n" +
                "coffee1 $coffee \n" +
                "coffee2 $coffee2")

        //coffee.connectElectricity()


//
//        val coffee = Coffee(farm,river)
//        coffee.toString()
    }
}