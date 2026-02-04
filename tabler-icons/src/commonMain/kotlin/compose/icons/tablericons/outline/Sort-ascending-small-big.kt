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

public val OutlineGroup.`Sort-ascending-small-big`: ImageVector
    get() {
        if (`_sort-ascending-small-big` != null) {
            return `_sort-ascending-small-big`!!
        }
        `_sort-ascending-small-big` = Builder(name = "Sort-ascending-small-big", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                verticalLineToRelative(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 5.667f)
                curveToRelative(0.0f, -0.369f, 0.298f, -0.667f, 0.667f, -0.667f)
                horizontalLineToRelative(2.666f)
                curveToRelative(0.369f, 0.0f, 0.667f, 0.298f, 0.667f, 0.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.667f, 0.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, true, -0.667f, -0.667f)
                verticalLineToRelative(-2.666f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 13.167f)
                curveToRelative(0.0f, -0.645f, 0.522f, -1.167f, 1.167f, -1.167f)
                horizontalLineToRelative(4.666f)
                curveToRelative(0.645f, 0.0f, 1.167f, 0.522f, 1.167f, 1.167f)
                verticalLineToRelative(4.666f)
                curveToRelative(0.0f, 0.645f, -0.522f, 1.167f, -1.167f, 1.167f)
                horizontalLineToRelative(-4.666f)
                arcToRelative(1.167f, 1.167f, 0.0f, false, true, -1.167f, -1.167f)
                verticalLineToRelative(-4.666f)
            }
        }
        .build()
        return `_sort-ascending-small-big`!!
    }

private var `_sort-ascending-small-big`: ImageVector? = null
