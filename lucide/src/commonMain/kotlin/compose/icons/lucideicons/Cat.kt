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

public val LucideIcons.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveToRelative(0.67f, 0.0f, 1.35f, 0.09f, 2.0f, 0.26f)
                curveToRelative(1.78f, -2.0f, 5.03f, -2.84f, 6.42f, -2.26f)
                curveToRelative(1.4f, 0.58f, -0.42f, 7.0f, -0.42f, 7.0f)
                curveToRelative(0.57f, 1.07f, 1.0f, 2.24f, 1.0f, 3.44f)
                curveTo(21.0f, 17.9f, 16.97f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(-9.0f, -3.0f, -9.0f, -7.56f)
                curveToRelative(0.0f, -1.25f, 0.5f, -2.4f, 1.0f, -3.44f)
                curveToRelative(0.0f, 0.0f, -1.89f, -6.42f, -0.5f, -7.0f)
                curveToRelative(1.39f, -0.58f, 4.72f, 0.23f, 6.5f, 2.23f)
                arcTo(9.04f, 9.04f, 0.0f, false, true, 12.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                verticalLineToRelative(0.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                verticalLineToRelative(0.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.25f, 16.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12.0f, 17.0f)
                lineToRelative(-0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
