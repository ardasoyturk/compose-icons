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

public val OutlineGroup.`Brand-flipboard`: ImageVector
    get() {
        if (`_brand-flipboard` != null) {
            return `_brand-flipboard`!!
        }
        `_brand-flipboard` = Builder(name = "Brand-flipboard", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.973f, 3.0f)
                horizontalLineToRelative(16.054f)
                curveToRelative(0.537f, 0.0f, 0.973f, 0.436f, 0.973f, 0.973f)
                verticalLineToRelative(4.052f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, -0.973f, 0.973f)
                horizontalLineToRelative(-5.025f)
                verticalLineToRelative(4.831f)
                curveToRelative(0.0f, 0.648f, -0.525f, 1.173f, -1.173f, 1.173f)
                horizontalLineToRelative(-4.829f)
                verticalLineToRelative(5.025f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, -0.974f, 0.973f)
                horizontalLineToRelative(-4.053f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, -0.973f, -0.973f)
                verticalLineToRelative(-16.054f)
                curveToRelative(0.0f, -0.537f, 0.436f, -0.973f, 0.973f, -0.973f)
            }
        }
        .build()
        return `_brand-flipboard`!!
    }

private var `_brand-flipboard`: ImageVector? = null
