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

public val LucideIcons.SendHorizontal: ImageVector
    get() {
        if (_sendHorizontal != null) {
            return _sendHorizontal!!
        }
        _sendHorizontal = Builder(name = "SendHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.714f, 3.048f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, false, -0.683f, 0.627f)
                lineToRelative(2.843f, 7.627f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 1.396f)
                lineToRelative(-2.842f, 7.627f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, false, 0.682f, 0.627f)
                lineToRelative(18.0f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.904f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(16.0f)
            }
        }
        .build()
        return _sendHorizontal!!
    }

private var _sendHorizontal: ImageVector? = null
