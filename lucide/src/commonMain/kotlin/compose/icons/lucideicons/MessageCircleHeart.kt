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

public val LucideIcons.MessageCircleHeart: ImageVector
    get() {
        if (_messageCircleHeart != null) {
            return _messageCircleHeart!!
        }
        _messageCircleHeart = Builder(name = "MessageCircleHeart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.992f, 16.342f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.094f, 1.167f)
                lineToRelative(-1.065f, 3.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.236f, 1.168f)
                lineToRelative(3.413f, -0.998f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.099f, 0.092f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -4.777f, -4.719f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.828f, 13.07f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 8.764f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.004f, 2.224f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.832f, 2.083f)
                lineToRelative(-3.447f, 3.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.45f, -0.001f)
                close()
            }
        }
        .build()
        return _messageCircleHeart!!
    }

private var _messageCircleHeart: ImageVector? = null
