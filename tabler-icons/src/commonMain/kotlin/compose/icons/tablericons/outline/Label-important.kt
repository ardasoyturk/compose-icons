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

public val OutlineGroup.`Label-important`: ImageVector
    get() {
        if (`_label-important` != null) {
            return `_label-important`!!
        }
        `_label-important` = Builder(name = "Label-important", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.52f, 7.0f)
                horizontalLineToRelative(-12.52f)
                lineToRelative(4.0f, 5.0f)
                lineToRelative(-4.0f, 5.0f)
                horizontalLineToRelative(12.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.375f)
                lineToRelative(3.7f, -4.625f)
                lineToRelative(-3.7f, -4.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.78f, -0.375f)
            }
        }
        .build()
        return `_label-important`!!
    }

private var `_label-important`: ImageVector? = null
