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

public val OutlineGroup.`Brand-google`: ImageVector
    get() {
        if (`_brand-google` != null) {
            return `_brand-google`!!
        }
        `_brand-google` = Builder(name = "Brand-google", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.945f, 11.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -3.284f, -5.997f)
                lineToRelative(-2.655f, 2.392f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 2.119f, 6.605f)
                horizontalLineToRelative(-4.125f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.945f)
            }
        }
        .build()
        return `_brand-google`!!
    }

private var `_brand-google`: ImageVector? = null
