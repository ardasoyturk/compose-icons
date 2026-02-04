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

public val OutlineGroup.`Filter-2-cog`: ImageVector
    get() {
        if (`_filter-2-cog` != null) {
            return `_filter-2-cog`!!
        }
        `_filter-2-cog` = Builder(name = "Filter-2-cog", defaultWidth = 24.0.dp, defaultHeight =
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
                horizontalLineToRelative(12.0f)
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
                moveTo(19.001f, 21.0f)
                curveToRelative(-0.53f, 0.0f, -1.039f, -0.211f, -1.414f, -0.586f)
                curveToRelative(-0.375f, -0.375f, -0.586f, -0.884f, -0.586f, -1.414f)
                curveToRelative(0.0f, -0.53f, 0.211f, -1.039f, 0.586f, -1.414f)
                curveToRelative(0.375f, -0.375f, 0.884f, -0.586f, 1.414f, -0.586f)
                moveToRelative(0.0f, 4.0f)
                curveToRelative(0.53f, 0.0f, 1.039f, -0.211f, 1.414f, -0.586f)
                curveToRelative(0.375f, -0.375f, 0.586f, -0.884f, 0.586f, -1.414f)
                curveToRelative(0.0f, -0.53f, -0.211f, -1.039f, -0.586f, -1.414f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(1.5f)
                moveToRelative(0.0f, -5.5f)
                verticalLineToRelative(-1.5f)
                moveToRelative(3.031f, 1.75f)
                lineToRelative(-1.299f, 0.75f)
                moveToRelative(-3.463f, 2.0f)
                lineToRelative(-1.3f, 0.75f)
                moveToRelative(0.0f, -3.5f)
                lineToRelative(1.3f, 0.75f)
                moveToRelative(3.463f, 2.0f)
                lineToRelative(1.3f, 0.75f)
            }
        }
        .build()
        return `_filter-2-cog`!!
    }

private var `_filter-2-cog`: ImageVector? = null
