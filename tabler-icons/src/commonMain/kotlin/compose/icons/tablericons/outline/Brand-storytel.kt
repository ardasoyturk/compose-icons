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

public val OutlineGroup.`Brand-storytel`: ImageVector
    get() {
        if (`_brand-storytel` != null) {
            return `_brand-storytel`!!
        }
        `_brand-storytel` = Builder(name = "Brand-storytel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.103f, 22.0f)
                curveToRelative(2.292f, -2.933f, 16.825f, -2.43f, 16.825f, -11.538f)
                curveToRelative(0.0f, -6.298f, -4.974f, -8.462f, -8.451f, -8.462f)
                curveToRelative(-3.477f, 0.0f, -9.477f, 3.036f, -9.477f, 11.241f)
                curveToRelative(0.0f, 6.374f, 1.103f, 8.759f, 1.103f, 8.759f)
            }
        }
        .build()
        return `_brand-storytel`!!
    }

private var `_brand-storytel`: ImageVector? = null
