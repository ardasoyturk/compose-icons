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

public val LucideIcons.MessageSquareHeart: ImageVector
    get() {
        if (_messageSquareHeart != null) {
            return _messageSquareHeart!!
        }
        _messageSquareHeart = Builder(name = "MessageSquareHeart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(6.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, 0.586f)
                lineToRelative(-2.202f, 2.202f)
                arcTo(0.71f, 0.71f, 0.0f, false, true, 2.0f, 21.286f)
                verticalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 9.5f)
                curveToRelative(0.0f, 0.687f, 0.265f, 1.383f, 0.697f, 1.844f)
                lineToRelative(3.009f, 3.264f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, 0.407f, 0.314f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.783f, -0.004f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, 0.398f, -0.31f)
                lineToRelative(3.008f, -3.264f)
                arcTo(2.77f, 2.77f, 0.0f, false, false, 16.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.5f, 1.5f)
            }
        }
        .build()
        return _messageSquareHeart!!
    }

private var _messageSquareHeart: ImageVector? = null
