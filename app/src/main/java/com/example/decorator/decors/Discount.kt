package com.example.decorator.decors

import android.graphics.Bitmap
import com.example.decorator.DecoratorPizza
import com.example.decorator.pizza.Pizza

class Discount(pizza: Pizza) : DecoratorPizza(pizza) {

    var discount = 5
    override var image: Bitmap
        get() = TODO("not implemented")
        set(value) {}

    override var description: String
        get() = pizza.description + "- Discount $discount $"
        set(value) {}

    override var price: Int
        get() = pizza.price - discount
        set(value) {}
}

