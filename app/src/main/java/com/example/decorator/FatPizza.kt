package com.example.decorator

import android.graphics.Bitmap
import android.graphics.BitmapFactory

class FatPizza : Pizza() {


    override var bitmap: Bitmap
        get() = BitmapFactory.decodeResource(App.instance.resources, R.drawable.p1)
        set(value) {}

    override var description: String
        get() = "Make base of Fat Pizza, "
        set(value) {}

    override var price: Int
        get() = 2
        set(value) {}


    override fun makePizza() {

    }
}