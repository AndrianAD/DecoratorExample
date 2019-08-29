package com.example.decorator.decors

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.decorator.*

class Becon(private var pizza: Pizza) : DecoratorPizza() {

    override fun makePizza() {
    }

    private var beconPrice = 5
    private var beconDescription = "adding Becon,"
    val becon = BitmapFactory.decodeResource(App.instance.resources, R.drawable.p4)



    override var description: String
        get() = pizza.description+ beconDescription
        set(value) {}

    override var price: Int
        get() = pizza.price+beconPrice
        set(value) {}

    override var bitmap: Bitmap
        get() = Utils.bitmapOverlayToCenter(pizza.bitmap, becon)
        set(value) {}
}

