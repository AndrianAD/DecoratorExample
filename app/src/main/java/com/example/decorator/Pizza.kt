package com.example.decorator

import android.graphics.Bitmap

abstract class Pizza {
    abstract var price: Int
    abstract var description: String
    abstract var bitmap: Bitmap

    abstract fun makePizza()
}