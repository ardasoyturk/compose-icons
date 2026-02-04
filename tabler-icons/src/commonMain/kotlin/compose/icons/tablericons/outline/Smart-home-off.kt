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

public val OutlineGroup.`Smart-home-off`: ImageVector
    get() {
        if (`_smart-home-off` != null) {
            return `_smart-home-off`!!
        }
        `_smart-home-off` = Builder(name = "Smart-home-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.097f, 7.125f)
                lineToRelative(-2.037f, 1.585f)
                arcToRelative(2.665f, 2.665f, 0.0f, false, false, -1.029f, 2.105f)
                verticalLineToRelative(7.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.559f, 0.0f, 1.064f, -0.229f, 1.427f, -0.598f)
                moveToRelative(0.572f, -3.417f)
                verticalLineToRelative(-5.185f)
                curveToRelative(0.0f, -0.823f, -0.38f, -1.6f, -1.03f, -2.105f)
                lineToRelative(-5.333f, -4.148f)
                arcToRelative(2.666f, 2.666f, 0.0f, false, false, -3.274f, 0.0f)
                lineToRelative(-1.029f, 0.8f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.332f, 15.345f)
                curveToRelative(-2.213f, 0.976f, -5.335f, 0.86f, -7.332f, -0.345f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_smart-home-off`!!
    }

private var `_smart-home-off`: ImageVector? = null
