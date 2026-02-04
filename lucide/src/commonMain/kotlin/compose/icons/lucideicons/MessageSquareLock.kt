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

public val LucideIcons.MessageSquareLock: ImageVector
    get() {
        if (_messageSquareLock != null) {
            return _messageSquareLock!!
        }
        _messageSquareLock = Builder(name = "MessageSquareLock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                verticalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.286f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 1.212f, 0.502f)
                lineToRelative(2.202f, -2.202f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.828f, 19.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                lineTo(21.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 16.0f)
                lineTo(22.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 19.0f)
                lineTo(14.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _messageSquareLock!!
    }

private var _messageSquareLock: ImageVector? = null
