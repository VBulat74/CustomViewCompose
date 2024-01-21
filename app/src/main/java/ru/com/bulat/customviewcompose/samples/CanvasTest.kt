package ru.com.bulat.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun CanvasTest() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        Oleg()
//        drawLine(
//            color = Color.White,
//            start = Offset(0f, 0f),
//            end = Offset(size.width, size.height),
//            strokeWidth = 2.dp.toPx(),
//        )
//        drawLine(
//            color = Color.White,
//            start = Offset(size.width, 0f),
//            end = Offset(0f, size.height),
//            strokeWidth = 2.dp.toPx(),
//        )
//
//        drawCircle(
//            Color.White,
//            radius = 100.dp.toPx(),
//            center = Offset(size.width / 2, size.height / 2),
//            style = Stroke(width = 2.dp.toPx())
//        )
    }
}

fun DrawScope.Oleg() {
    drawCircle(
        Color.White,
        radius = 25.dp.toPx(),
        center = Offset(50.dp.toPx(), 50.dp.toPx()),
        style = Stroke(width = 2.dp.toPx())
    )

    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(85.dp.toPx(),75.dp.toPx()),
        end = Offset(110.dp.toPx(),25.dp.toPx())
    )

    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(110.dp.toPx(),25.dp.toPx()),
        end = Offset(135.dp.toPx(),75.dp.toPx())
    )

    //E
    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(145.dp.toPx(),25.dp.toPx()),
        end = Offset(145.dp.toPx(),75.dp.toPx())
    )

    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(145.dp.toPx(),25.dp.toPx()),
        end = Offset(175.dp.toPx(),25.dp.toPx())
    )

    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(145.dp.toPx(),50.dp.toPx()),
        end = Offset(175.dp.toPx(),50.dp.toPx())
    )

    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(145.dp.toPx(),75.dp.toPx()),
        end = Offset(175.dp.toPx(),75.dp.toPx())
    )

    //Г
    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(190.dp.toPx(),25.dp.toPx()),
        end = Offset(225.dp.toPx(),25.dp.toPx())
    )

    drawLine(
        color = Color.White,
        strokeWidth = 1.dp.toPx(),
        start = Offset(190.dp.toPx(),25.dp.toPx()),
        end = Offset(190.dp.toPx(),75.dp.toPx())
    )
}
