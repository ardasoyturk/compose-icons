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

public val OutlineGroup.`Filter-spark`: ImageVector
    get() {
        if (`_filter-spark` != null) {
            return `_filter-spark`!!
        }
        `_filter-spark` = Builder(name = "Filter-spark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.5f)
                verticalLineToRelative(-0.5f)
                lineToRelative(4.414f, -4.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, -1.414f)
                verticalLineToRelative(-2.172f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(2.227f)
                curveToRelative(0.0f, 0.497f, 0.185f, 0.977f, 0.52f, 1.345f)
                lineToRelative(4.48f, 4.928f)
                verticalLineToRelative(8.5f)
                lineToRelative(2.0f, -0.667f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 22.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -3.5f, -3.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -3.5f, 3.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 3.5f, 3.5f)
            }
        }
        .build()
        return `_filter-spark`!!
    }

private var `_filter-spark`: ImageVector? = null
