package com.example.decorator

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix

class App : Application() {

    companion object {

        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this


    }


}
