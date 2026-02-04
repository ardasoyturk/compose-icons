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

public val LucideIcons.LineSquiggle: ImageVector
    get() {
        if (_lineSquiggle != null) {
            return _lineSquiggle!!
        }
        _lineSquiggle = Builder(name = "LineSquiggle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.5f)
                curveToRelative(5.0f, -2.0f, 7.0f, 2.5f, 3.0f, 4.0f)
                curveTo(1.5f, 10.0f, 2.0f, 15.0f, 5.0f, 16.0f)
                curveToRelative(5.0f, 2.0f, 9.0f, -10.0f, 14.0f, -7.0f)
                reflectiveCurveToRelative(0.5f, 13.5f, -4.0f, 12.0f)
                curveToRelative(-5.0f, -2.5f, 0.5f, -11.0f, 6.0f, -2.0f)
            }
        }
        .build()
        return _lineSquiggle!!
    }

private var _lineSquiggle: ImageVector? = null
