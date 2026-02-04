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

public val LucideIcons.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = Builder(name = "Clover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.17f, 7.83f)
                lineTo(2.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.02f, 12.0f)
                arcToRelative(2.827f, 2.827f, 0.0f, true, true, 3.81f, -4.17f)
                arcTo(2.827f, 2.827f, 0.0f, true, true, 12.0f, 4.02f)
                arcToRelative(2.827f, 2.827f, 0.0f, true, true, 4.17f, 3.81f)
                arcTo(2.827f, 2.827f, 0.0f, true, true, 19.98f, 12.0f)
                arcToRelative(2.827f, 2.827f, 0.0f, true, true, -3.81f, 4.17f)
                arcTo(2.827f, 2.827f, 0.0f, true, true, 12.0f, 19.98f)
                arcToRelative(2.827f, 2.827f, 0.0f, true, true, -4.17f, -3.81f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 4.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(7.83f, 7.83f)
                lineToRelative(8.34f, 8.34f)
            }
        }
        .build()
        return _clover!!
    }

private var _clover: ImageVector? = null
