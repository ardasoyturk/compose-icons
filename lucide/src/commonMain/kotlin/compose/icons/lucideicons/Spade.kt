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

public val LucideIcons.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 14.499f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 9.591f, 3.675f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.818f, 0.001f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 22.0f, 14.5f)
                curveToRelative(0.0f, -2.29f, -1.5f, -4.0f, -3.0f, -5.5f)
                lineToRelative(-5.492f, -5.312f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.0f, -0.02f)
                lineTo(5.0f, 8.999f)
                curveToRelative(-1.5f, 1.5f, -3.0f, 3.2f, -3.0f, 5.5f)
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
