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

public val OutlineGroup.`Brand-fiverr`: ImageVector
    get() {
        if (`_brand-fiverr` != null) {
            return `_brand-fiverr`!!
        }
        `_brand-fiverr` = Builder(name = "Brand-fiverr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.033f)
                arcToRelative(1.967f, 1.967f, 0.0f, false, true, 2.0f, -1.967f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
            }
        }
        .build()
        return `_brand-fiverr`!!
    }

private var `_brand-fiverr`: ImageVector? = null
