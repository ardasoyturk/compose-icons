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

public val LucideIcons.Ham: ImageVector
    get() {
        if (_ham != null) {
            return _ham!!
        }
        _ham = Builder(name = "Ham", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.144f, 21.144f)
                arcTo(7.274f, 10.445f, 45.0f, true, false, 2.856f, 10.856f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.144f, 21.144f)
                arcTo(7.274f, 4.365f, 45.0f, false, false, 2.856f, 10.856f)
                arcToRelative(7.274f, 4.365f, 45.0f, false, false, 10.288f, 10.288f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.565f, 10.435f)
                lineTo(18.6f, 8.4f)
                arcToRelative(2.501f, 2.501f, 0.0f, true, false, 1.65f, -4.65f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -4.66f, 1.66f)
                lineToRelative(-2.024f, 2.025f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(8.5f, 16.5f)
                lineToRelative(-1.0f, -1.0f)
            }
        }
        .build()
        return _ham!!
    }

private var _ham: ImageVector? = null
