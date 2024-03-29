package com.example.decorator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.decorator.decors.*
import kotlinx.android.synthetic.main.activity_main.*
import com.example.decorator.pizza.FatPizza
import com.example.decorator.pizza.Pizza
import com.example.decorator.pizza.ThinPizza


class MainActivity : AppCompatActivity() {

    var list = arrayListOf(1, 2, 4)
    var pizza: Pizza = FatPizza()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newThinPizza.setOnClickListener {
            pizza = ThinPizza()
            imageView.setImageBitmap(pizza.image)
            updateText()

        }

        newFatPizza.setOnClickListener {
            pizza = FatPizza()
            imageView.setImageBitmap(pizza.image)
            updateText()

        }

        addCheeze.setOnClickListener {
            pizza = Cheese(pizza)
            imageView.setImageBitmap(pizza.image)
            updateText()
        }

        addBecon.setOnClickListener {
            pizza = Bacon(pizza)
            imageView.setImageBitmap(pizza.image)
            updateText()
        }


        addMushroom.setOnClickListener {
            pizza = Mushroom(pizza)
            imageView.setImageBitmap(pizza.image)
            updateText()
        }


        standartPizza.setOnClickListener {
            pizza = Mozarella(Cheese(Bacon(Mushroom(ThinPizza()))))
            imageView.setImageBitmap(pizza.image)
            updateText()
        }

        clear.setOnClickListener {
            pizza = FatPizza()
            imageView.setImageBitmap(pizza.image)
            updateText()
        }

        getDiscount.setOnClickListener {
            val discount: Pizza = Discount(pizza)
            price.text = "Price: ${discount.price} $"
            description.text = "Description:  ${discount.description}"
        }

    }

    private fun updateText() {
        price.text = "Price: ${pizza.price} $"
        description.text = "Description:  ${pizza.description}"
    }

}
