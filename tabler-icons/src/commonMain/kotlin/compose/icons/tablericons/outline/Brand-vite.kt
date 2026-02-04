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

public val OutlineGroup.`Brand-vite`: ImageVector
    get() {
        if (`_brand-vite` != null) {
            return `_brand-vite`!!
        }
        `_brand-vite` = Builder(name = "Brand-vite", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 4.5f)
                lineToRelative(6.0f, -1.5f)
                lineToRelative(-2.0f, 6.5f)
                lineToRelative(2.0f, -0.5f)
                lineToRelative(-4.0f, 7.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-3.0f, 1.0f)
                lineToRelative(1.0f, -7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 6.5f)
                lineToRelative(7.0f, -1.5f)
                lineToRelative(-10.0f, 17.0f)
                lineToRelative(-10.0f, -17.0f)
                lineToRelative(7.741f, 1.5f)
            }
        }
        .build()
        return `_brand-vite`!!
    }

private var `_brand-vite`: ImageVector? = null
