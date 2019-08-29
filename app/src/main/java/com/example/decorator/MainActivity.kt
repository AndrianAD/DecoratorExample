package com.example.decorator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.example.decorator.decors.Becon
import com.example.decorator.decors.Cheese


class MainActivity : AppCompatActivity() {

    var pizza: Pizza = FatPizza()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        newPizza.setOnClickListener {
            imageView.setImageBitmap(pizza.bitmap)
            price.text="Price: ${pizza.price}"
            description.text="Description:  ${pizza.description}   "
        }

        addCheeze.setOnClickListener {
            pizza = Cheese(pizza)
            imageView.setImageBitmap(pizza.bitmap)
            price.text="Price: ${pizza.price}"
            description.text="Description:  ${pizza.description}  "
        }

        addBecon.setOnClickListener {
            pizza = Becon(pizza)
            imageView.setImageBitmap(pizza.bitmap)
            price.text="Price: ${pizza.price}"
            description.text="Description:  ${pizza.description}   "
        }


        getPrice.setOnClickListener {

        }


    }

}
