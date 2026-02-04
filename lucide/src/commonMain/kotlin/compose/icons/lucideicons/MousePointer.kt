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

public val LucideIcons.MousePointer: ImageVector
    get() {
        if (_mousePointer != null) {
            return _mousePointer!!
        }
        _mousePointer = Builder(name = "MousePointer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.586f, 12.586f)
                lineTo(19.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.688f, 3.037f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, -0.651f, 0.651f)
                lineToRelative(6.5f, 15.999f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, false, 0.947f, -0.062f)
                lineToRelative(1.569f, -6.083f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.448f, -1.479f)
                lineToRelative(6.124f, -1.579f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.063f, -0.947f)
                close()
            }
        }
        .build()
        return _mousePointer!!
    }

private var _mousePointer: ImageVector? = null
