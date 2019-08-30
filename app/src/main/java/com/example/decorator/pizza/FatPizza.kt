package com.example.decorator.pizza

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.decorator.App
import com.example.decorator.R

class FatPizza : Pizza() {


    override var image: Bitmap
        get() = BitmapFactory.decodeResource(
            App.instance.resources,
            R.drawable.base
        )
        set(value) {}

    override var price: Int
        get() = 2
        set(value) {}

    override var description: String
        get() = "Make base of Fat Pizza, $price $ \n"
        set(value) {}


    override fun makePizza() {

    }
}