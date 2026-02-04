package compose.icons.tablericons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.tablericons.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.`Cake-roll`: ImageVector
    get() {
        if (`_cake-roll` != null) {
            return `_cake-roll`!!
        }
        `_cake-roll` = Builder(name = "Cake-roll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, -2.462f, -9.0f, -5.5f)
                reflectiveCurveToRelative(4.03f, -5.5f, 9.0f, -5.5f)
                reflectiveCurveToRelative(9.0f, 2.462f, 9.0f, 5.5f)
                reflectiveCurveToRelative(-4.03f, 5.5f, -9.0f, 5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.97f)
                curveToRelative(3.0f, 0.0f, 4.0f, 1.036f, 4.0f, 1.979f)
                curveToRelative(0.0f, 2.805f, -8.0f, 2.969f, -8.0f, -0.99f)
                curveToRelative(0.0f, -2.11f, 1.5f, -3.959f, 4.0f, -3.959f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.333f)
                verticalLineToRelative(5.334f)
                curveToRelative(0.0f, 2.945f, -4.03f, 5.333f, -9.0f, 5.333f)
                curveToRelative(-4.97f, 0.0f, -9.0f, -2.388f, -9.0f, -5.333f)
                verticalLineToRelative(-5.334f)
            }
        }
        .build()
        return `_cake-roll`!!
    }

private var `_cake-roll`: ImageVector? = null
