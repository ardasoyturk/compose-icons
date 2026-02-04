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

public val OutlineGroup.`Battery-vertical-eco`: ImageVector
    get() {
        if (`_battery-vertical-eco` != null) {
            return `_battery-vertical-eco`!!
        }
        `_battery-vertical-eco` = Builder(name = "Battery-vertical-eco", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                moveToRelative(-8.0f, 12.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 17.143f)
                curveToRelative(0.0f, -2.84f, 2.09f, -5.143f, 4.667f, -5.143f)
                horizontalLineToRelative(2.333f)
                verticalLineToRelative(0.857f)
                curveToRelative(0.0f, 2.84f, -2.09f, 5.143f, -4.667f, 5.143f)
                horizontalLineToRelative(-2.333f)
                lineToRelative(0.0f, -0.857f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineToRelative(-3.0f)
            }
        }
        .build()
        return `_battery-vertical-eco`!!
    }

private var `_battery-vertical-eco`: ImageVector? = null
