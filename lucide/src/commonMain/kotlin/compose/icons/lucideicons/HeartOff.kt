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

public val LucideIcons.HeartOff: ImageVector
    get() {
        if (_heartOff != null) {
            return _heartOff!!
        }
        _heartOff = Builder(name = "HeartOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 4.893f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.091f, 0.931f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.818f, 0.0f)
                arcTo(5.49f, 5.49f, 0.0f, false, true, 22.0f, 9.5f)
                curveToRelative(0.0f, 1.872f, -1.002f, 3.356f, -2.187f, 4.655f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(16.967f, 16.967f)
                lineToRelative(-3.459f, 3.346f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 0.019f)
                lineTo(5.0f, 15.0f)
                curveToRelative(-1.5f, -1.5f, -3.0f, -3.2f, -3.0f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 2.747f, -4.761f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 2.0f)
                lineToRelative(20.0f, 20.0f)
            }
        }
        .build()
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
