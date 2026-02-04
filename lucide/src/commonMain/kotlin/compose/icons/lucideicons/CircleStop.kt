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

public val LucideIcons.CircleStop: ImageVector
    get() {
        if (_circleStop != null) {
            return _circleStop!!
        }
        _circleStop = Builder(name = "CircleStop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 10.0f)
                lineTo(15.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 14.0f)
                lineTo(9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _circleStop!!
    }

private var _circleStop: ImageVector? = null
