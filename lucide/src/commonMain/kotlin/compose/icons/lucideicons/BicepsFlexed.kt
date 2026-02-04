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

public val LucideIcons.BicepsFlexed: ImageVector
    get() {
        if (_bicepsFlexed != null) {
            return _bicepsFlexed!!
        }
        _bicepsFlexed = Builder(name = "BicepsFlexed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.409f, 13.017f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 22.0f, 15.0f)
                curveToRelative(0.0f, 3.866f, -4.0f, 7.0f, -9.0f, 7.0f)
                curveToRelative(-4.077f, 0.0f, -8.153f, -0.82f, -10.371f, -2.462f)
                curveToRelative(-0.426f, -0.316f, -0.631f, -0.832f, -0.62f, -1.362f)
                curveTo(2.118f, 12.723f, 2.627f, 2.0f, 10.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                curveToRelative(-1.105f, 0.0f, -1.64f, -0.444f, -2.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.584f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.964f, 6.825f)
                curveTo(8.019f, 7.977f, 9.5f, 13.0f, 8.0f, 15.0f)
            }
        }
        .build()
        return _bicepsFlexed!!
    }

private var _bicepsFlexed: ImageVector? = null
