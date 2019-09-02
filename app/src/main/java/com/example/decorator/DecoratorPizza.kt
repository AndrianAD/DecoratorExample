package com.example.decorator

import com.example.decorator.pizza.Pizza

abstract class DecoratorPizza(var pizza: Pizza) : Pizza() {

    override fun make() {
    }
}