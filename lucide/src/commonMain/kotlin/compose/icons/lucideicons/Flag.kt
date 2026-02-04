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

public val LucideIcons.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.4f, -0.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(3.0f, 0.0f, 5.0f, 2.0f, 7.333f, 2.0f)
                quadToRelative(2.0f, 0.0f, 3.067f, -0.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.4f, 0.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 16.0f, 16.0f)
                curveToRelative(-3.0f, 0.0f, -5.0f, -2.0f, -8.0f, -2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.0f, 1.528f)
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
