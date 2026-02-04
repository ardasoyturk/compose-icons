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

public val LucideIcons.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.338f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.987f, 0.244f)
                lineTo(6.396f, 21.01f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.77f, -0.56f)
                lineToRelative(0.881f, -5.139f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, false, -0.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.294f, -0.906f)
                lineToRelative(5.165f, -0.755f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, false, 1.597f, -1.16f)
                lineToRelative(2.309f, -4.679f)
                arcTo(0.53f, 0.53f, 0.0f, false, true, 12.0f, 2.0f)
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
