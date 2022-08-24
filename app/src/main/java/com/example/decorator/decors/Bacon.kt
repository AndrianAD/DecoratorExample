package com.example.decorator.decors
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.decorator.*
import com.example.decorator.pizza.Pizza

class Bacon(pizza: Pizza) : DecoratorPizza(pizza) {

    private var baconPrice = 9
    private var baconDescription = "adding Bacon, $baconPrice $ \n"
    private val bacon = BitmapFactory.decodeResource(App.instance.resources, R.drawable.becon)

    override var description: String
        get() = pizza.description + baconDescription
        set(value) {}

    override var price: Int
        get() = pizza.price + baconPrice
        set(value) {}

    override var image: Bitmap
        get() = Utils.bitmapOverlayToCenter(pizza.image, bacon)
        set(value) {}

    override fun make() {
    }

}

