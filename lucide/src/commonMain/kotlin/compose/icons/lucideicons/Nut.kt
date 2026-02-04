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

public val LucideIcons.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
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
                arcTo(7.003f, 7.003f, 0.0f, false, false, 19.0f, 14.0f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(8.0f, 4.0f, 4.5f, 6.0f, 4.0f, 8.0f)
                curveToRelative(-0.243f, 0.97f, -0.919f, 1.952f, -2.0f, 3.0f)
                curveToRelative(1.31f, -0.082f, 1.972f, -0.29f, 3.0f, -1.0f)
                curveToRelative(0.54f, 0.92f, 0.982f, 1.356f, 2.0f, 2.0f)
                curveToRelative(1.452f, -0.647f, 1.954f, -1.098f, 2.5f, -2.0f)
                curveToRelative(0.595f, 0.995f, 1.151f, 1.427f, 2.5f, 2.0f)
                curveToRelative(1.31f, -0.621f, 1.862f, -1.058f, 2.5f, -2.0f)
                curveToRelative(0.629f, 0.977f, 1.162f, 1.423f, 2.5f, 2.0f)
                curveToRelative(1.209f, -0.548f, 1.68f, -0.967f, 2.0f, -2.0f)
                curveToRelative(1.032f, 0.916f, 1.683f, 1.157f, 3.0f, 1.0f)
                curveToRelative(-1.297f, -1.036f, -1.758f, -2.03f, -2.0f, -3.0f)
                curveToRelative(-0.5f, -2.0f, -4.0f, -4.0f, -8.0f, -4.0f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
