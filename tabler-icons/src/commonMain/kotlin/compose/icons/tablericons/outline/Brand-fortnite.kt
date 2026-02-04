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

public val OutlineGroup.`Brand-fortnite`: ImageVector
    get() {
        if (`_brand-fortnite` != null) {
            return `_brand-fortnite`!!
        }
        `_brand-fortnite` = Builder(name = "Brand-fortnite", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(7.5f)
                lineToRelative(-0.5f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.5f)
                lineToRelative(-4.0f, 1.0f)
                lineToRelative(0.0f, -18.0f)
            }
        }
        .build()
        return `_brand-fortnite`!!
    }

private var `_brand-fortnite`: ImageVector? = null
