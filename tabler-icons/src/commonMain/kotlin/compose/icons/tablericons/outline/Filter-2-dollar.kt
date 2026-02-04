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

public val OutlineGroup.`Filter-2-dollar`: ImageVector
    get() {
        if (`_filter-2-dollar` != null) {
            return `_filter-2-dollar`!!
        }
        `_filter-2-dollar` = Builder(name = "Filter-2-dollar", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                moveToRelative(-2.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(1.0f)
                moveToRelative(0.0f, -1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.398f, 0.0f, 0.779f, -0.158f, 1.061f, -0.439f)
                curveToRelative(0.281f, -0.281f, 0.439f, -0.663f, 0.439f, -1.061f)
                curveToRelative(0.0f, -0.398f, -0.158f, -0.779f, -0.439f, -1.061f)
                curveToRelative(-0.281f, -0.281f, -0.663f, -0.439f, -1.061f, -0.439f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.398f, 0.0f, -0.779f, -0.158f, -1.061f, -0.439f)
                curveToRelative(-0.281f, -0.281f, -0.439f, -0.663f, -0.439f, -1.061f)
                curveToRelative(0.0f, -0.398f, 0.158f, -0.779f, 0.439f, -1.061f)
                curveToRelative(0.281f, -0.281f, 0.663f, -0.439f, 1.061f, -0.439f)
                horizontalLineToRelative(0.5f)
                moveToRelative(0.0f, -1.0f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return `_filter-2-dollar`!!
    }

private var `_filter-2-dollar`: ImageVector? = null
