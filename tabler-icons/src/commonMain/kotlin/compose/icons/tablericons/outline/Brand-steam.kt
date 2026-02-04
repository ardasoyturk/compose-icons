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

public val OutlineGroup.`Brand-steam`: ImageVector
    get() {
        if (`_brand-steam` != null) {
            return `_brand-steam`!!
        }
        `_brand-steam` = Builder(name = "Brand-steam", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -0.653f, 8.953f)
                lineToRelative(-4.347f, 3.009f)
                lineToRelative(0.0f, 0.038f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 3.0f)
                lineToRelative(-0.176f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.94f, -2.402f)
                lineToRelative(-2.56f, -1.098f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.51f, 1.755f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 2.834f, -0.635f)
                lineToRelative(2.727f, -3.818f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.429f, -5.302f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
        }
        .build()
        return `_brand-steam`!!
    }

private var `_brand-steam`: ImageVector? = null
