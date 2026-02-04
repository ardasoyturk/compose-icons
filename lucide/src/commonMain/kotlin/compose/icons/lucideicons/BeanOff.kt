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

public val LucideIcons.BeanOff: ImageVector
    get() {
        if (_beanOff != null) {
            return _beanOff!!
        }
        _beanOff = Builder(name = "BeanOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                curveToRelative(-0.64f, 0.64f, -1.521f, 0.954f, -2.402f, 1.165f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 22.0f)
                arcToRelative(13.96f, 13.96f, 0.0f, false, false, 9.9f, -4.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.75f, 5.093f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 22.0f, 8.0f)
                curveToRelative(0.0f, 2.411f, -0.61f, 4.68f, -1.683f, 6.66f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.341f, 10.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.487f, 1.208f)
                moveTo(10.62f, 5.341f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, true, 2.039f, 2.04f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                lineTo(22.0f, 22.0f)
            }
        }
        .build()
        return _beanOff!!
    }

private var _beanOff: ImageVector? = null
