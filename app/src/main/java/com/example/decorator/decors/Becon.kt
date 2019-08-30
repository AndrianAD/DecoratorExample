package com.example.decorator.decors

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.decorator.*
import com.example.decorator.pizza.Pizza

class Becon(private var pizza: Pizza) : DecoratorPizza() {

    override fun makePizza() {
    }

    private var beconPrice = 9
    private var beconDescription = "adding Becon, $beconPrice $ \n"
    val becon = BitmapFactory.decodeResource(App.instance.resources, R.drawable.becon)



    override var description: String
        get() = pizza.description+ beconDescription
        set(value) {}

    override var price: Int
        get() = pizza.price+beconPrice
        set(value) {}

    override var image: Bitmap
        get() = Utils.bitmapOverlayToCenter(pizza.image, becon)
        set(value) {}
}

