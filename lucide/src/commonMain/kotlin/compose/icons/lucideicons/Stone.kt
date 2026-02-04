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

public val LucideIcons.Stone: ImageVector
    get() {
        if (_stone != null) {
            return _stone!!
        }
        _stone = Builder(name = "Stone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.264f, 2.205f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.42f, 4.211f)
                lineToRelative(-4.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.359f, 5.117f)
                lineToRelative(6.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.438f, 0.0f)
                lineToRelative(6.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.576f, -4.592f)
                lineToRelative(-2.0f, -6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.53f, -2.53f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.99f, 22.0f)
                lineTo(14.0f, 12.0f)
                lineToRelative(7.822f, 3.184f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                lineTo(8.47f, 2.302f)
            }
        }
        .build()
        return _stone!!
    }

private var _stone: ImageVector? = null
