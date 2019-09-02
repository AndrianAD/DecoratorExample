package com.example.decorator.decors

import android.util.Log

class SadList(private val list: MutableList<Int>) : MutableList<Int>  by list{

    override fun remove(element: Int): Boolean {
        Log.d("Remove", "Sadddddd :( removed: $element")
        return list.remove(element)
    }

}