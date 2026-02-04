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

public val LucideIcons.PencilOff: ImageVector
    get() {
        if (_pencilOff != null) {
            return _pencilOff!!
        }
        _pencilOff = Builder(name = "PencilOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(10.0f, 10.0f)
                lineToRelative(-6.157f, 6.162f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.5f, 0.833f)
                lineToRelative(-1.322f, 4.36f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.622f, 0.624f)
                lineToRelative(4.358f, -1.323f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.83f, -0.5f)
                lineTo(14.0f, 13.982f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(12.829f, 7.172f)
                lineToRelative(4.359f, -4.346f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 3.986f, 3.986f)
                lineToRelative(-4.353f, 4.353f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(15.0f, 5.0f)
                lineToRelative(4.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 2.0f)
                lineToRelative(20.0f, 20.0f)
            }
        }
        .build()
        return _pencilOff!!
    }

private var _pencilOff: ImageVector? = null
