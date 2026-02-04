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

public val OutlineGroup.`Lemon-2`: ImageVector
    get() {
        if (`_lemon-2` != null) {
            return `_lemon-2`!!
        }
        `_lemon-2` = Builder(name = "Lemon-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.185f, 3.611f)
                curveToRelative(1.55f, 2.94f, 0.873f, 6.917f, -1.892f, 9.682f)
                curveToRelative(-2.765f, 2.765f, -6.743f, 3.442f, -9.682f, 1.892f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.796f, -2.796f)
                curveToRelative(-1.55f, -2.94f, -0.873f, -6.917f, 1.892f, -9.682f)
                curveToRelative(2.765f, -2.765f, 6.743f, -3.442f, 9.682f, -1.892f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.611f, -0.815f)
            }
        }
        .build()
        return `_lemon-2`!!
    }

private var `_lemon-2`: ImageVector? = null
