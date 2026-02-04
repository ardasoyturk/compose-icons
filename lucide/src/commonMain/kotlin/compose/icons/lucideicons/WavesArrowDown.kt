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

public val LucideIcons.WavesArrowDown: ImageVector
    get() {
        if (_wavesArrowDown != null) {
            return _wavesArrowDown!!
        }
        _wavesArrowDown = Builder(name = "WavesArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineTo(12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                lineTo(12.0f, 10.0f)
                lineTo(8.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(2.6f, 15.5f, 3.2f, 16.0f, 4.5f, 16.0f)
                curveTo(7.0f, 16.0f, 7.0f, 14.0f, 9.5f, 14.0f)
                curveTo(12.1f, 14.0f, 11.9f, 16.0f, 14.5f, 16.0f)
                curveTo(17.0f, 16.0f, 17.0f, 14.0f, 19.5f, 14.0f)
                curveTo(20.8f, 14.0f, 21.4f, 14.5f, 22.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                curveTo(2.6f, 21.5f, 3.2f, 22.0f, 4.5f, 22.0f)
                curveTo(7.0f, 22.0f, 7.0f, 20.0f, 9.5f, 20.0f)
                curveTo(12.1f, 20.0f, 11.9f, 22.0f, 14.5f, 22.0f)
                curveTo(17.0f, 22.0f, 17.0f, 20.0f, 19.5f, 20.0f)
                curveTo(20.8f, 20.0f, 21.4f, 20.5f, 22.0f, 21.0f)
            }
        }
        .build()
        return _wavesArrowDown!!
    }

private var _wavesArrowDown: ImageVector? = null
