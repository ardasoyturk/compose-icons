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

public val OutlineGroup.`Garden-cart-off`: ImageVector
    get() {
        if (`_garden-cart-off` != null) {
            return `_garden-cart-off`!!
        }
        `_garden-cart-off` = Builder(name = "Garden-cart-off", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.733f, 15.732f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 3.544f, 3.527f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.806f, 0.591f)
                lineToRelative(3.694f, -5.091f)
                verticalLineToRelative(0.055f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-3.0f, 6.01f)
                moveToRelative(-3.319f, 0.693f)
                lineToRelative(-4.276f, -0.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.296f, -2.493f)
                lineToRelative(-2.853f, -7.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.928f, -0.63f)
                horizontalLineToRelative(-1.323f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_garden-cart-off`!!
    }

private var `_garden-cart-off`: ImageVector? = null
