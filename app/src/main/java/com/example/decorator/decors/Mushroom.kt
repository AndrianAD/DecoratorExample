package com.example.decorator.decors

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.decorator.*
import com.example.decorator.pizza.Pizza

class Mushroom(private var pizza: Pizza) : DecoratorPizza() {

    override fun makePizza() {
    }

    private var mushroomPrice = 8
    private var mushroomDescription = "Adding mushroom, $mushroomPrice $ \n"
    private val mushroomImage =
        BitmapFactory.decodeResource(App.instance.resources, R.drawable.grib)
    private val collaImage = BitmapFactory.decodeResource(App.instance.resources, R.drawable.colla)


    override var description: String
        get() = pizza.description + mushroomDescription
        set(value) {}

    override var price: Int
        get() = pizza.price + mushroomPrice
        set(value) {}

    override var image: Bitmap
        get() = Utils.bitmapOverlayToCenter(pizza.image, mushroomImage)
        set(value) {}
}

