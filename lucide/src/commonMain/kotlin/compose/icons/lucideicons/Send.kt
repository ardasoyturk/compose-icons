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

public val LucideIcons.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.536f, 21.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.937f, -0.024f)
                lineToRelative(6.5f, -19.0f)
                arcToRelative(0.496f, 0.496f, 0.0f, false, false, -0.635f, -0.635f)
                lineToRelative(-19.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.024f, 0.937f)
                lineToRelative(7.93f, 3.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.112f, 1.11f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(21.854f, 2.147f)
                lineToRelative(-10.94f, 10.939f)
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
