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

public val LucideIcons.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) {
            return _dropletOff!!
        }
        _dropletOff = Builder(name = "DropletOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.715f, 13.186f)
                curveTo(18.29f, 11.858f, 17.384f, 10.607f, 16.0f, 9.5f)
                curveToRelative(-2.0f, -1.6f, -3.5f, -4.0f, -4.0f, -6.5f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, true, -0.884f, 2.586f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 2.0f)
                lineToRelative(20.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.795f, 8.797f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 8.0f, 9.5f)
                curveTo(6.0f, 11.1f, 5.0f, 13.0f, 5.0f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 13.222f, 3.208f)
            }
        }
        .build()
        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
