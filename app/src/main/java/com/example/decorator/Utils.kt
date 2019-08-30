package com.example.decorator

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix

object Utils{
    fun bitmapOverlayToCenter(bitmap1: Bitmap, overlayBitmap: Bitmap): Bitmap {
        val bitmap1Width = bitmap1.width
        val bitmap1Height = bitmap1.height
        val bitmap2Width = overlayBitmap.width
        val bitmap2Height = overlayBitmap.height

        val marginLeft = (bitmap1Width * 0.5 - bitmap2Width * 0.5).toFloat()
        val marginTop = (bitmap1Height * 0.5 - bitmap2Height * 0.5).toFloat()

        val finalBitmap = Bitmap.createBitmap(bitmap1Width, bitmap1Height, bitmap1.config)
        val canvas = Canvas(finalBitmap)
        canvas.drawBitmap(bitmap1, Matrix(), null)
        canvas.drawBitmap(overlayBitmap, marginLeft, marginTop, null)
        return finalBitmap
    }

}


fun funk1( x:Int ) :Int  {
    return x+1
}

fun funk2( x:Int ) :Int  {
    return x+1
}

fun funk3( x:Int ) :Int  {
    return x+1
}

fun funk4( x:Int ) :Int  {
    return x+1
}

fun funk5( x:Int ) :Int  {
    return x+1
}

fun funk6( x:Int ) :Int  {
    return x+1
}


var result = (funk1(funk2(funk3(funk4(funk5(funk6(1)))))))

