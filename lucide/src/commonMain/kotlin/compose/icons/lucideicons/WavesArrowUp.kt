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

public val LucideIcons.WavesArrowUp: ImageVector
    get() {
        if (_wavesArrowUp != null) {
            return _wavesArrowUp!!
        }
        _wavesArrowUp = Builder(name = "WavesArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveToRelative(0.6f, 0.5f, 1.2f, 1.0f, 2.5f, 1.0f)
                curveToRelative(2.5f, 0.0f, 2.5f, -2.0f, 5.0f, -2.0f)
                curveToRelative(2.6f, 0.0f, 2.4f, 2.0f, 5.0f, 2.0f)
                curveToRelative(2.5f, 0.0f, 2.5f, -2.0f, 5.0f, -2.0f)
                curveToRelative(1.3f, 0.0f, 1.9f, 0.5f, 2.5f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                curveToRelative(0.6f, 0.5f, 1.2f, 1.0f, 2.5f, 1.0f)
                curveToRelative(2.5f, 0.0f, 2.5f, -2.0f, 5.0f, -2.0f)
                curveToRelative(2.6f, 0.0f, 2.4f, 2.0f, 5.0f, 2.0f)
                curveToRelative(2.5f, 0.0f, 2.5f, -2.0f, 5.0f, -2.0f)
                curveToRelative(1.3f, 0.0f, 1.9f, 0.5f, 2.5f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(8.0f, 6.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
            }
        }
        .build()
        return _wavesArrowUp!!
    }

private var _wavesArrowUp: ImageVector? = null
