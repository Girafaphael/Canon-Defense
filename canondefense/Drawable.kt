package com.example.canondefense

import android.graphics.Canvas

abstract class Drawable(view: DrawingView) {
    open fun draw(canvas: Canvas) {}

}
