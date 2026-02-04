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

public val LucideIcons.MousePointer2Off: ImageVector
    get() {
        if (_mousePointer2Off != null) {
            return _mousePointer2Off!!
        }
        _mousePointer2Off = Builder(name = "MousePointer2Off", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(15.55f, 8.45f)
                lineToRelative(5.138f, 2.087f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.063f, 0.947f)
                lineToRelative(-6.124f, 1.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.438f, 1.435f)
                lineToRelative(-1.579f, 6.126f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.947f, 0.063f)
                lineTo(8.45f, 15.551f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(6.816f, 11.528f)
                lineToRelative(-2.779f, -6.84f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, 0.651f, -0.651f)
                lineToRelative(6.84f, 2.779f)
            }
        }
        .build()
        return _mousePointer2Off!!
    }

private var _mousePointer2Off: ImageVector? = null
