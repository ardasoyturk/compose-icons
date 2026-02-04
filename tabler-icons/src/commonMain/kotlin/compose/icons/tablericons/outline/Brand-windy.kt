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

public val OutlineGroup.`Brand-windy`: ImageVector
    get() {
        if (`_brand-windy` != null) {
            return `_brand-windy`!!
        }
        `_brand-windy` = Builder(name = "Brand-windy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveToRelative(0.0f, 5.5f, -0.33f, 16.0f, 4.0f, 16.0f)
                reflectiveCurveToRelative(7.546f, -11.27f, 8.0f, -13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveToRelative(0.253f, 5.44f, 1.449f, 16.0f, 5.894f, 16.0f)
                curveToRelative(4.444f, 0.0f, 8.42f, -10.036f, 9.106f, -14.0f)
            }
        }
        .build()
        return `_brand-windy`!!
    }

private var `_brand-windy`: ImageVector? = null
