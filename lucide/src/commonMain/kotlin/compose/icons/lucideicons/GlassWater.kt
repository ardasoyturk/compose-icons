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

public val LucideIcons.GlassWater: ImageVector
    get() {
        if (_glassWater != null) {
            return _glassWater!!
        }
        _glassWater = Builder(name = "GlassWater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.116f, 4.104f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.11f, 3.0f)
                horizontalLineToRelative(11.78f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.994f, 1.105f)
                lineTo(17.19f, 20.21f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.2f, 22.0f)
                horizontalLineTo(8.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.79f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 6.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 6.0f, 0.0f)
            }
        }
        .build()
        return _glassWater!!
    }

private var _glassWater: ImageVector? = null
