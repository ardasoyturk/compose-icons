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

public val OutlineGroup.`Brand-debian`: ImageVector
    get() {
        if (`_brand-debian` != null) {
            return `_brand-debian`!!
        }
        `_brand-debian` = Builder(name = "Brand-debian", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.397f, -0.943f, -4.0f, -3.153f, -4.0f, -5.635f)
                curveToRelative(0.0f, -2.19f, 1.039f, -3.14f, 1.604f, -3.595f)
                curveToRelative(2.646f, -2.133f, 6.396f, -0.27f, 6.396f, 3.23f)
                curveToRelative(0.0f, 2.5f, -2.905f, 2.121f, -3.5f, 1.5f)
                curveToRelative(-0.595f, -0.621f, -1.0f, -1.5f, -0.5f, -2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -18.0f, 0.0f)
            }
        }
        .build()
        return `_brand-debian`!!
    }

private var `_brand-debian`: ImageVector? = null
