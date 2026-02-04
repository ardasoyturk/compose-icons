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

public val LucideIcons.Worm: ImageVector
    get() {
        if (_worm != null) {
            return _worm!!
        }
        _worm = Builder(name = "Worm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(19.0f, 12.0f)
                lineToRelative(-1.5f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.63f, 18.81f)
                lineTo(22.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.47f, 8.23f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, true, 2.44f, 1.93f)
                lineToRelative(-0.64f, 2.08f)
                arcToRelative(6.76f, 6.76f, 0.0f, false, false, 10.16f, 7.67f)
                lineToRelative(0.42f, -0.27f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.73f, -4.21f)
                lineToRelative(-0.42f, 0.27f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, -2.63f, -1.99f)
                lineToRelative(0.64f, -2.08f)
                arcTo(6.66f, 6.66f, 0.0f, false, false, 3.94f, 3.9f)
                lineToRelative(-0.7f, 0.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.55f, 4.34f)
                close()
            }
        }
        .build()
        return _worm!!
    }

private var _worm: ImageVector? = null
