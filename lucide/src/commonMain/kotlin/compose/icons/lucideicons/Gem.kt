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

public val LucideIcons.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 3.0f)
                lineTo(8.0f, 9.0f)
                lineToRelative(4.0f, 13.0f)
                lineToRelative(4.0f, -13.0f)
                lineToRelative(-2.5f, -6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.6f, 0.8f)
                lineToRelative(3.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.013f, 2.382f)
                lineToRelative(-7.99f, 10.986f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.247f, 0.0f)
                lineToRelative(-7.99f, -10.986f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.4f, 7.8f)
                lineToRelative(2.998f, -3.997f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(20.0f)
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
