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

public val OutlineGroup.`Brand-lastfm`: ImageVector
    get() {
        if (`_brand-lastfm` != null) {
            return `_brand-lastfm`!!
        }
        `_brand-lastfm` = Builder(name = "Brand-lastfm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                curveToRelative(-0.83f, -1.0f, -1.388f, -1.0f, -2.0f, -1.0f)
                curveToRelative(-0.612f, 0.0f, -2.0f, 0.271f, -2.0f, 2.0f)
                reflectiveCurveToRelative(1.384f, 2.233f, 3.0f, 3.0f)
                curveToRelative(1.616f, 0.767f, 2.125f, 1.812f, 2.0f, 3.0f)
                reflectiveCurveToRelative(-1.0f, 2.0f, -3.0f, 2.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.5f, -2.0f)
                reflectiveCurveToRelative(-1.585f, -4.78f, -2.497f, -6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -1.0f, 7.0f)
            }
        }
        .build()
        return `_brand-lastfm`!!
    }

private var `_brand-lastfm`: ImageVector? = null
