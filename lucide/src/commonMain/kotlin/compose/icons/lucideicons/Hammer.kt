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

public val LucideIcons.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(15.0f, 12.0f)
                lineToRelative(-9.373f, 9.373f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -3.001f, -3.0f)
                lineTo(12.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(18.0f, 15.0f)
                lineToRelative(4.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(21.5f, 11.5f)
                lineToRelative(-1.914f, -1.914f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 8.172f)
                verticalLineToRelative(-0.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.586f, -1.414f)
                lineToRelative(-1.657f, -1.657f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.516f, 3.0f)
                horizontalLineTo(9.0f)
                lineToRelative(1.243f, 1.243f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 8.485f)
                verticalLineTo(10.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(1.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineTo(18.5f, 14.5f)
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
