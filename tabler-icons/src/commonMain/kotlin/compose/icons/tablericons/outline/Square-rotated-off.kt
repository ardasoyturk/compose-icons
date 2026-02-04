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

public val OutlineGroup.`Square-rotated-off`: ImageVector
    get() {
        if (`_square-rotated-off` != null) {
            return `_square-rotated-off`!!
        }
        `_square-rotated-off` = Builder(name = "Square-rotated-off", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.964f, 16.952f)
                lineToRelative(-3.462f, 3.461f)
                curveToRelative(-0.782f, 0.783f, -2.222f, 0.783f, -3.0f, 0.0f)
                lineToRelative(-6.911f, -6.91f)
                curveToRelative(-0.783f, -0.783f, -0.783f, -2.223f, 0.0f, -3.0f)
                lineToRelative(3.455f, -3.456f)
                moveToRelative(2.0f, -2.0f)
                lineToRelative(1.453f, -1.452f)
                curveToRelative(0.782f, -0.783f, 2.222f, -0.783f, 3.0f, 0.0f)
                lineToRelative(6.911f, 6.91f)
                curveToRelative(0.783f, 0.783f, 0.783f, 2.223f, 0.0f, 3.0f)
                lineToRelative(-1.448f, 1.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_square-rotated-off`!!
    }

private var `_square-rotated-off`: ImageVector? = null
