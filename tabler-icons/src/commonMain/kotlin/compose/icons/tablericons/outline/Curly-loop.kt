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

public val OutlineGroup.`Curly-loop`: ImageVector
    get() {
        if (`_curly-loop` != null) {
            return `_curly-loop`!!
        }
        `_curly-loop` = Builder(name = "Curly-loop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                curveToRelative(-4.0f, 0.0f, -7.0f, 2.0f, -7.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(0.0f, -3.0f, -2.5f, -5.0f, -8.0f, -5.0f)
                reflectiveCurveToRelative(-8.0f, 2.0f, -8.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(0.0f, -3.0f, -3.0f, -5.0f, -7.0f, -5.0f)
            }
        }
        .build()
        return `_curly-loop`!!
    }

private var `_curly-loop`: ImageVector? = null
