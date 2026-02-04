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

public val LucideIcons.Cctv: ImageVector
    get() {
        if (_cctv != null) {
            return _cctv!!
        }
        _cctv = Builder(name = "Cctv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.75f, 12.0f)
                horizontalLineToRelative(3.632f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.894f, 1.447f)
                lineToRelative(-2.034f, 4.069f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.708f, 0.134f)
                lineToRelative(-2.124f, -2.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.106f, 9.053f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.447f, 1.341f)
                lineToRelative(-3.106f, 6.211f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.342f, 0.447f)
                lineTo(3.61f, 12.3f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, true, -1.3f, -3.91f)
                lineTo(3.69f, 5.6f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, true, 3.92f, -1.3f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                horizontalLineToRelative(3.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.8f, -1.1f)
                lineTo(9.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                verticalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(0.01f)
            }
        }
        .build()
        return _cctv!!
    }

private var _cctv: ImageVector? = null
