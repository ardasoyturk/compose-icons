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

public val OutlineGroup.`Brand-disney`: ImageVector
    get() {
        if (`_brand-disney` != null) {
            return `_brand-disney`!!
        }
        `_brand-disney` = Builder(name = "Brand-disney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.22f, 5.838f)
                curveToRelative(-1.307f, -0.15f, -1.22f, -0.578f, -1.22f, -0.794f)
                curveToRelative(0.0f, -0.216f, 0.424f, -1.044f, 4.34f, -1.044f)
                curveToRelative(4.694f, 0.0f, 14.66f, 3.645f, 14.66f, 10.042f)
                reflectiveCurveToRelative(-8.71f, 4.931f, -10.435f, 4.52f)
                curveToRelative(-1.724f, -0.412f, -5.565f, -2.256f, -5.565f, -4.174f)
                curveToRelative(0.0f, -1.395f, 3.08f, -2.388f, 6.715f, -2.388f)
                curveToRelative(3.634f, 0.0f, 5.285f, 1.041f, 5.285f, 2.0f)
                curveToRelative(0.0f, 0.5f, -0.074f, 1.229f, -1.0f, 1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.02f, 8.0f)
                arcToRelative(505.153f, 505.153f, 0.0f, false, false, 0.0f, 13.0f)
            }
        }
        .build()
        return `_brand-disney`!!
    }

private var `_brand-disney`: ImageVector? = null
