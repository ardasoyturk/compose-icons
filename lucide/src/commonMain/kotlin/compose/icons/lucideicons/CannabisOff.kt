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

public val LucideIcons.CannabisOff: ImageVector
    get() {
        if (_cannabisOff != null) {
            return _cannabisOff!!
        }
        _cannabisOff = Builder(name = "CannabisOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(1.5f, 1.5f, 3.5f, 3.0f, 6.0f, 3.0f)
                curveToRelative(0.0f, -1.5f, -0.5f, -3.5f, -2.0f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.988f, 8.327f)
                curveTo(13.902f, 6.054f, 13.365f, 3.82f, 12.0f, 2.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, -1.445f, 2.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.375f, 11.725f)
                curveTo(18.882f, 10.53f, 21.0f, 7.841f, 21.0f, 6.0f)
                curveToRelative(-2.324f, 0.0f, -5.08f, 1.296f, -6.662f, 2.684f)
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
                moveTo(21.024f, 15.378f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 22.0f, 15.0f)
                curveToRelative(-0.426f, -1.279f, -2.67f, -2.557f, -4.25f, -2.907f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.995f, 6.992f)
                curveTo(5.714f, 6.4f, 4.29f, 6.0f, 3.0f, 6.0f)
                curveToRelative(0.0f, 2.0f, 2.5f, 5.0f, 4.0f, 6.0f)
                curveToRelative(-1.5f, 0.0f, -4.5f, 1.5f, -5.0f, 3.0f)
                curveToRelative(3.5f, 1.5f, 6.0f, 1.0f, 6.0f, 1.0f)
                curveToRelative(-1.5f, 1.5f, -2.0f, 3.5f, -2.0f, 5.0f)
                curveToRelative(2.5f, 0.0f, 4.5f, -1.5f, 6.0f, -3.0f)
            }
        }
        .build()
        return _cannabisOff!!
    }

private var _cannabisOff: ImageVector? = null
