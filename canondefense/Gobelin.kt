package com.example.canondefense

import android.graphics.Canvas
import android.graphics.Color


class Gobelin(view: DrawingView, x1: Float, y1: Float): Ennemi(view, x1, y1) {
    override val diametre = 30f
    override var dx=2f
    override var dy=2f

    override fun draw(canvas: Canvas) {
        ennemiPaint.color = Color.GREEN
        super.draw(canvas)
    }
}
