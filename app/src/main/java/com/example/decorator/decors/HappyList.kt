package com.example.decorator.decors

import android.util.Log


class HappyList(private val list: MutableList<Int>) : MutableList<Int>  by list{
    override fun add(element: Int): Boolean {
        Log.d("Add", "Ihhhhuu! URAAA - added $element")
        return list.add(element)
    }

}