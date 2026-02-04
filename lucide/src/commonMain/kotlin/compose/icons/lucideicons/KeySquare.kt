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

public val LucideIcons.KeySquare: ImageVector
    get() {
        if (_keySquare != null) {
            return _keySquare!!
        }
        _keySquare = Builder(name = "KeySquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.4f, 2.7f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.4f, 0.0f)
                lineToRelative(5.5f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 3.4f)
                lineToRelative(-3.7f, 3.7f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.4f, 0.0f)
                lineTo(8.7f, 9.8f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -3.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(14.0f, 7.0f)
                lineToRelative(3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(9.4f, 10.6f)
                lineToRelative(-6.814f, 6.814f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 18.828f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(0.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, -0.586f)
                lineToRelative(0.814f, -0.814f)
            }
        }
        .build()
        return _keySquare!!
    }

private var _keySquare: ImageVector? = null
