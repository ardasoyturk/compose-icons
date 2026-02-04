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

public val OutlineGroup.`Smart-home`: ImageVector
    get() {
        if (`_smart-home` != null) {
            return `_smart-home`!!
        }
        `_smart-home` = Builder(name = "Smart-home", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.71f)
                lineToRelative(-5.333f, -4.148f)
                arcToRelative(2.666f, 2.666f, 0.0f, false, false, -3.274f, 0.0f)
                lineToRelative(-5.334f, 4.148f)
                arcToRelative(2.665f, 2.665f, 0.0f, false, false, -1.029f, 2.105f)
                verticalLineToRelative(7.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-7.2f)
                curveToRelative(0.0f, -0.823f, -0.38f, -1.6f, -1.03f, -2.105f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                curveToRelative(-2.21f, 1.333f, -5.792f, 1.333f, -8.0f, 0.0f)
            }
        }
        .build()
        return `_smart-home`!!
    }

private var `_smart-home`: ImageVector? = null
