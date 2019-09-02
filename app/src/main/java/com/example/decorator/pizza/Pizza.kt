package com.example.decorator.pizza

import android.graphics.Bitmap

abstract class Pizza {
    abstract var price: Int
    abstract var description: String
    abstract var image: Bitmap

    abstract fun make()
}