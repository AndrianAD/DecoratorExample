package com.example.decorator.decors

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.decorator.App
import com.example.decorator.DecoratorPizza
import com.example.decorator.pizza.Pizza
import com.example.decorator.R
import com.example.decorator.Utils.bitmapOverlayToCenter

class Cheese(private var pizza: Pizza) : DecoratorPizza() {

    override fun makePizza() {
    }

    private var cheesePrice = 6
    private var cheeseDescription = "adding Cheese, $cheesePrice $ \n"
    val cheese = BitmapFactory.decodeResource(App.instance.resources, R.drawable.cheese)


    override var description: String
        get() = pizza.description + cheeseDescription
        set(value) {}

    override var price: Int
        get() = pizza.price + cheesePrice
        set(value) {}

    override var image: Bitmap
        get() = bitmapOverlayToCenter(pizza.image, cheese)
        set(value) {}
}

