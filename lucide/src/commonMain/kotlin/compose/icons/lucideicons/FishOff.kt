package compose.icons.lucideicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LucideIcons
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val LucideIcons.FishOff: ImageVector
    get() {
        if (_fishOff != null) {
            return _fishOff!!
        }
        _fishOff = Builder(name = "FishOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.47f)
                verticalLineToRelative(0.03f)
                moveToRelative(0.0f, -0.5f)
                verticalLineToRelative(0.47f)
                moveToRelative(-0.475f, 5.056f)
                arcTo(6.744f, 6.744f, 0.0f, false, true, 15.0f, 18.0f)
                curveToRelative(-3.56f, 0.0f, -7.56f, -2.53f, -8.5f, -6.0f)
                curveToRelative(0.348f, -1.28f, 1.114f, -2.433f, 2.121f, -3.38f)
                moveToRelative(3.444f, -2.088f)
                arcTo(8.802f, 8.802f, 0.0f, false, true, 15.0f, 6.0f)
                curveToRelative(3.56f, 0.0f, 6.06f, 2.54f, 7.0f, 6.0f)
                curveToRelative(-0.309f, 1.14f, -0.786f, 2.177f, -1.413f, 3.058f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.67f)
                curveTo(7.0f, 8.0f, 5.58f, 5.97f, 2.73f, 5.5f)
                curveToRelative(-1.0f, 1.5f, -1.0f, 5.0f, 0.23f, 6.5f)
                curveToRelative(-1.24f, 1.5f, -1.24f, 5.0f, -0.23f, 6.5f)
                curveTo(5.58f, 18.03f, 7.0f, 16.0f, 7.0f, 13.33f)
                moveToRelative(7.48f, -4.372f)
                arcTo(9.77f, 9.77f, 0.0f, false, true, 16.0f, 6.07f)
                moveToRelative(0.0f, 11.86f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, true, -1.728f, -3.618f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(16.01f, 17.93f)
                lineToRelative(-0.23f, 1.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.8f, 21.0f)
                horizontalLineTo(9.5f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, 1.49f, -3.98f)
                moveTo(8.53f, 3.0f)
                horizontalLineToRelative(5.27f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.98f, 1.67f)
                lineToRelative(0.23f, 1.4f)
                moveTo(2.0f, 2.0f)
                lineToRelative(20.0f, 20.0f)
            }
        }
        .build()
        return _fishOff!!
    }

private var _fishOff: ImageVector? = null
