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

public val OutlineGroup.`Brand-polymer`: ImageVector
    get() {
        if (`_brand-polymer` != null) {
            return `_brand-polymer`!!
        }
        `_brand-polymer` = Builder(name = "Brand-polymer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.706f, 6.0f)
                lineToRelative(-3.706f, 6.0f)
                lineToRelative(3.706f, 6.0f)
                horizontalLineToRelative(1.059f)
                lineToRelative(8.47f, -12.0f)
                horizontalLineToRelative(1.06f)
                lineToRelative(3.705f, 6.0f)
                lineToRelative(-3.706f, 6.0f)
            }
        }
        .build()
        return `_brand-polymer`!!
    }

private var `_brand-polymer`: ImageVector? = null
