package com.kotlin.daggerkotlin

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class River @Inject constructor()
{
    fun getWater():String = "Water"
}