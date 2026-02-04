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

public val LucideIcons.Origami: ImageVector
    get() {
        if (_origami != null) {
            return _origami!!
        }
        _origami = Builder(name = "Origami", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.297f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.651f, 1.759f)
                lineToRelative(-4.696f, 4.025f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(12.0f, 21.0f)
                lineToRelative(-7.414f, -7.414f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 12.172f)
                verticalLineTo(6.415f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, true, 1.707f, -0.707f)
                lineTo(20.0f, 20.009f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(12.214f, 3.381f)
                lineToRelative(8.414f, 14.966f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.167f, 1.199f)
                lineToRelative(-1.168f, 1.163f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.706f, 0.291f)
                horizontalLineTo(6.351f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.625f, -0.219f)
                lineTo(3.25f, 18.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.631f, -1.781f)
                lineToRelative(4.165f, 0.027f)
            }
        }
        .build()
        return _origami!!
    }

private var _origami: ImageVector? = null
