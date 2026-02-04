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

public val OutlineGroup.`Brand-snapchat`: ImageVector
    get() {
        if (`_brand-snapchat` != null) {
            return `_brand-snapchat`!!
        }
        `_brand-snapchat` = Builder(name = "Brand-snapchat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.882f, 7.842f)
                arcToRelative(4.882f, 4.882f, 0.0f, false, false, -9.764f, 0.0f)
                curveToRelative(0.0f, 4.273f, -0.213f, 6.409f, -4.118f, 8.118f)
                curveToRelative(2.0f, 0.882f, 2.0f, 0.882f, 3.0f, 3.0f)
                curveToRelative(3.0f, 0.0f, 4.0f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveToRelative(3.0f, -2.0f, 6.0f, -2.0f)
                curveToRelative(1.0f, -2.118f, 1.0f, -2.118f, 3.0f, -3.0f)
                curveToRelative(-3.906f, -1.709f, -4.118f, -3.845f, -4.118f, -8.118f)
                moveToRelative(-13.882f, 8.119f)
                curveToRelative(4.0f, -2.118f, 4.0f, -4.118f, 1.0f, -7.118f)
                moveToRelative(17.0f, 7.118f)
                curveToRelative(-4.0f, -2.118f, -4.0f, -4.118f, -1.0f, -7.118f)
            }
        }
        .build()
        return `_brand-snapchat`!!
    }

private var `_brand-snapchat`: ImageVector? = null
