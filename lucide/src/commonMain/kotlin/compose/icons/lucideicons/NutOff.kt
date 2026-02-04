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

public val LucideIcons.NutOff: ImageVector
    get() {
        if (_nutOff != null) {
            return _nutOff!!
        }
        _nutOff = Builder(name = "NutOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(7.004f, 7.004f, 0.0f, false, false, 5.277f, 6.787f)
                curveToRelative(0.412f, 0.104f, 0.802f, 0.292f, 1.102f, 0.592f)
                lineTo(12.0f, 22.0f)
                lineToRelative(0.621f, -0.621f)
                curveToRelative(0.3f, -0.3f, 0.69f, -0.488f, 1.102f, -0.592f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, false, 4.125f, -2.939f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                verticalLineToRelative(3.343f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.349f, -0.573f, -1.905f, -1.005f, -2.5f, -2.0f)
                curveToRelative(-0.546f, 0.902f, -1.048f, 1.353f, -2.5f, 2.0f)
                curveToRelative(-1.018f, -0.644f, -1.46f, -1.08f, -2.0f, -2.0f)
                curveToRelative(-1.028f, 0.71f, -1.69f, 0.918f, -3.0f, 1.0f)
                curveToRelative(1.081f, -1.048f, 1.757f, -2.03f, 2.0f, -3.0f)
                curveToRelative(0.194f, -0.776f, 0.84f, -1.551f, 1.79f, -2.21f)
                moveToRelative(11.654f, 5.997f)
                curveToRelative(0.887f, -0.457f, 1.28f, -0.891f, 1.556f, -1.787f)
                curveToRelative(1.032f, 0.916f, 1.683f, 1.157f, 3.0f, 1.0f)
                curveToRelative(-1.297f, -1.036f, -1.758f, -2.03f, -2.0f, -3.0f)
                curveToRelative(-0.5f, -2.0f, -4.0f, -4.0f, -8.0f, -4.0f)
                curveToRelative(-0.74f, 0.0f, -1.461f, 0.068f, -2.15f, 0.192f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                lineTo(22.0f, 22.0f)
            }
        }
        .build()
        return _nutOff!!
    }

private var _nutOff: ImageVector? = null
