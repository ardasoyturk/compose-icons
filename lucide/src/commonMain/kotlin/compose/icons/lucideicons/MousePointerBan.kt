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

public val LucideIcons.MousePointerBan: ImageVector
    get() {
        if (_mousePointerBan != null) {
            return _mousePointerBan!!
        }
        _mousePointerBan = Builder(name = "MousePointerBan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.034f, 2.681f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, 0.647f, -0.647f)
                lineToRelative(9.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.033f, 0.944f)
                lineTo(8.204f, 7.545f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.66f, 0.66f)
                lineToRelative(-1.066f, 3.443f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.944f, 0.033f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                moveToRelative(-6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(11.8f, 11.8f)
                lineToRelative(8.4f, 8.4f)
            }
        }
        .build()
        return _mousePointerBan!!
    }

private var _mousePointerBan: ImageVector? = null
