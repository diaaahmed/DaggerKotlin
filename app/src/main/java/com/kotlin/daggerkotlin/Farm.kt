package com.kotlin.daggerkotlin

import javax.inject.Inject
import javax.inject.Singleton

class Farm @Inject constructor() {
    fun getBeans():String = "Beans"

}