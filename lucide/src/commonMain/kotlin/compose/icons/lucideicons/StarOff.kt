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

public val LucideIcons.StarOff: ImageVector
    get() {
        if (_starOff != null) {
            return _starOff!!
        }
        _starOff = Builder(name = "StarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(10.344f, 4.688f)
                lineToRelative(1.181f, -2.393f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.95f, 0.0f)
                lineToRelative(2.31f, 4.679f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, false, 1.595f, 1.16f)
                lineToRelative(5.166f, 0.756f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.294f, 0.904f)
                lineToRelative(-3.237f, 3.152f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(17.945f, 17.945f)
                lineToRelative(0.43f, 2.505f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.771f, 0.56f)
                lineToRelative(-4.618f, -2.428f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, false, -1.973f, 0.0f)
                lineTo(6.396f, 21.01f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.77f, -0.56f)
                lineToRelative(0.881f, -5.139f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, false, -0.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.294f, -0.906f)
                lineToRelative(5.165f, -0.755f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.4f, -0.099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 2.0f)
                lineToRelative(20.0f, 20.0f)
            }
        }
        .build()
        return _starOff!!
    }

private var _starOff: ImageVector? = null
