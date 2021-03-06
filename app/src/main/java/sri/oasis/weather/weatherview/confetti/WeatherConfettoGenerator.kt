package com.github.matteobattilana.weather.confetti

import android.graphics.*
import com.github.matteobattilana.weather.PrecipType
import sri.oasis.weather.weatherview.confetti.ConfettoGenerator
import sri.oasis.weather.weatherview.confetti.ConfettoInfo
import sri.oasis.weather.weatherview.confetto.Confetto
import java.util.*


class WeatherConfettoGenerator(val confettoInfo: ConfettoInfo) : ConfettoGenerator {
    override fun generateConfetto(random: Random): Confetto = MotionBlurBitmapConfetto(confettoInfo)
}

class MotionBlurBitmapConfetto(val confettoInfo: ConfettoInfo) : Confetto() {
    companion object {
        const val SNOW_RADIUS = 7.5f
        const val RAIN_STRETCH = 1.5f
    }

    private var prevX: Float? = null
    private var prevY: Float? = null

    override fun getHeight(): Int = 0

    override fun getWidth(): Int = 0

    override fun reset() {
        super.reset()
        prevX = null
        prevY = null
    }

    override fun configurePaint(paint: Paint) {
        super.configurePaint(paint)
        paint.color = Color.WHITE
        paint.isAntiAlias = true
    }

    override fun drawInternal(canvas: Canvas, matrix: Matrix, paint: Paint, x: Float, y: Float, rotation: Float, percentageAnimated: Float) {
        if (prevX == null || prevY == null) {
            prevX = x
            prevY = y
        }

        when (confettoInfo.precipType) {
                PrecipType.CLEAR -> {
                }
                PrecipType.RAIN -> {
                    val dX = x - prevX!!
                    val dY = y - prevY!!
                    val x1 = prevX!! - dX * RAIN_STRETCH
                    val y1 = prevY!! - dY * RAIN_STRETCH
                    val x2 = x + dX * RAIN_STRETCH
                    val y2 = y + dY * RAIN_STRETCH

                    paint.shader = LinearGradient(x1, y1, x2, y2,
                            intArrayOf(Color.TRANSPARENT, Color.WHITE, Color.WHITE, Color.TRANSPARENT),
                            floatArrayOf(0f, 0.45f, 0.55f, 1f),
                            Shader.TileMode.CLAMP)

                    canvas.drawLine(x1, y1, x2, y2, paint)
                }
                PrecipType.SNOW -> {
                    paint.shader = RadialGradient(x, y, SNOW_RADIUS,
                            intArrayOf(Color.WHITE, Color.WHITE, Color.TRANSPARENT, Color.TRANSPARENT),
                            floatArrayOf(0f, 0.15f, 0.95f, 1f),
                            Shader.TileMode.CLAMP)

                    canvas.drawCircle(x, y, SNOW_RADIUS, paint)
                }
        }

        prevX = x
        prevY = y
    }
}