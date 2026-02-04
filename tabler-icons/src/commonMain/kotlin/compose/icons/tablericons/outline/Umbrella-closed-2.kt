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

public val OutlineGroup.`Umbrella-closed-2`: ImageVector
    get() {
        if (`_umbrella-closed-2` != null) {
            return `_umbrella-closed-2`!!
        }
        `_umbrella-closed-2` = Builder(name = "Umbrella-closed-2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.697f, 12.071f)
                lineToRelative(11.313f, -7.071f)
                lineToRelative(-7.07f, 11.314f)
                lineToRelative(-4.243f, -4.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.743f, 14.475f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-1.886f, 1.886f, 0.943f, 4.715f, 2.828f, 2.829f)
            }
        }
        .build()
        return `_umbrella-closed-2`!!
    }

private var `_umbrella-closed-2`: ImageVector? = null
