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

public val OutlineGroup.`Hemisphere-off`: ImageVector
    get() {
        if (`_hemisphere-off` != null) {
            return `_hemisphere-off`!!
        }
        `_hemisphere-off` = Builder(name = "Hemisphere-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.588f, 6.603f)
                curveToRelative(-2.178f, 0.547f, -3.588f, 1.417f, -3.588f, 2.397f)
                curveToRelative(0.0f, 1.657f, 4.03f, 3.0f, 9.0f, 3.0f)
                moveToRelative(3.72f, -0.267f)
                curveToRelative(3.114f, -0.473f, 5.28f, -1.518f, 5.28f, -2.733f)
                curveToRelative(0.0f, -1.657f, -4.03f, -3.0f, -9.0f, -3.0f)
                curveToRelative(-0.662f, 0.0f, -1.308f, 0.024f, -1.93f, 0.07f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 13.677f, 7.69f)
                moveToRelative(2.165f, -1.843f)
                arcToRelative(8.965f, 8.965f, 0.0f, false, false, 2.158f, -5.847f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_hemisphere-off`!!
    }

private var `_hemisphere-off`: ImageVector? = null
