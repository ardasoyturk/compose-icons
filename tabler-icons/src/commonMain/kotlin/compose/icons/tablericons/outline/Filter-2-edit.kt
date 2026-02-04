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

public val OutlineGroup.`Filter-2-edit`: ImageVector
    get() {
        if (`_filter-2-edit` != null) {
            return `_filter-2-edit`!!
        }
        `_filter-2-edit` = Builder(name = "Filter-2-edit", defaultWidth = 24.0.dp, defaultHeight =
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
                horizontalLineToRelative(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.42f, 15.61f)
                curveToRelative(0.195f, -0.195f, 0.426f, -0.35f, 0.681f, -0.455f)
                curveToRelative(0.255f, -0.106f, 0.528f, -0.16f, 0.804f, -0.16f)
                curveToRelative(0.276f, 0.0f, 0.549f, 0.054f, 0.804f, 0.16f)
                curveToRelative(0.255f, 0.106f, 0.486f, 0.26f, 0.681f, 0.455f)
                curveToRelative(0.195f, 0.195f, 0.35f, 0.427f, 0.455f, 0.681f)
                curveToRelative(0.106f, 0.255f, 0.16f, 0.528f, 0.16f, 0.804f)
                curveToRelative(0.0f, 0.276f, -0.054f, 0.549f, -0.16f, 0.804f)
                curveToRelative(-0.105f, 0.255f, -0.26f, 0.486f, -0.455f, 0.681f)
                lineToRelative(-3.39f, 3.42f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(3.42f, -3.39f)
            }
        }
        .build()
        return `_filter-2-edit`!!
    }

private var `_filter-2-edit`: ImageVector? = null
