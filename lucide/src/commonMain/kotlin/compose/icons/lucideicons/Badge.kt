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

public val LucideIcons.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.85f, 8.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.78f, -4.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.74f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.78f, 4.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.77f, 4.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.75f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.78f, -4.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -6.76f)
                close()
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
