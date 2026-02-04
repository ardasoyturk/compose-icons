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

public val OutlineGroup.`Pig-money`: ImageVector
    get() {
        if (`_pig-money` != null) {
            return `_pig-money`!!
        }
        `_pig-money` = Builder(name = "Pig-money", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.173f, 8.378f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 4.656f, -1.377f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                verticalLineToRelative(3.803f)
                arcToRelative(6.019f, 6.019f, 0.0f, false, true, 2.658f, 3.197f)
                horizontalLineToRelative(1.341f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.342f)
                curveToRelative(-0.336f, 0.95f, -0.907f, 1.8f, -1.658f, 2.473f)
                verticalLineToRelative(2.027f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.583f)
                arcToRelative(6.04f, 6.04f, 0.0f, false, true, -1.0f, 0.083f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(6.04f, 6.04f, 0.0f, false, true, -1.0f, -0.083f)
                verticalLineToRelative(0.583f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(0.0f, -0.027f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.0f, -10.473f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4.5f, -3.0f)
            }
        }
        .build()
        return `_pig-money`!!
    }

private var `_pig-money`: ImageVector? = null
