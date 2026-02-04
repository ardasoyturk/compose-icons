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

public val OutlineGroup.`Filter-2-pin`: ImageVector
    get() {
        if (`_filter-2-pin` != null) {
            return `_filter-2-pin`!!
        }
        `_filter-2-pin` = Builder(name = "Filter-2-pin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                verticalLineToRelative(0.01f)
                moveToRelative(2.121f, 2.111f)
                curveToRelative(0.42f, -0.419f, 0.706f, -0.954f, 0.821f, -1.536f)
                curveToRelative(0.116f, -0.582f, 0.056f, -1.185f, -0.17f, -1.733f)
                curveToRelative(-0.227f, -0.548f, -0.611f, -1.017f, -1.105f, -1.347f)
                curveToRelative(-0.493f, -0.33f, -1.073f, -0.506f, -1.667f, -0.506f)
                curveToRelative(-0.593f, 0.0f, -1.173f, 0.176f, -1.667f, 0.506f)
                curveToRelative(-0.493f, 0.33f, -0.878f, 0.798f, -1.105f, 1.347f)
                curveToRelative(-0.227f, 0.548f, -0.286f, 1.151f, -0.17f, 1.733f)
                curveToRelative(0.116f, 0.582f, 0.402f, 1.116f, 0.821f, 1.536f)
                curveToRelative(0.418f, 0.419f, 1.125f, 1.045f, 2.121f, 1.879f)
                curveToRelative(1.051f, -0.89f, 1.759f, -1.516f, 2.121f, -1.879f)
                lineToRelative(-2.121f, -2.121f)
            }
        }
        .build()
        return `_filter-2-pin`!!
    }

private var `_filter-2-pin`: ImageVector? = null
