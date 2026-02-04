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

public val OutlineGroup.`Brand-xamarin`: ImageVector
    get() {
        if (`_brand-xamarin` != null) {
            return `_brand-xamarin`!!
        }
        `_brand-xamarin` = Builder(name = "Brand-xamarin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.958f, 21.0f)
                horizontalLineToRelative(-7.917f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.732f, -1.0f)
                lineToRelative(-4.041f, -7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineToRelative(4.041f, -7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.732f, -1.0f)
                horizontalLineToRelative(7.917f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.732f, 1.0f)
                lineToRelative(4.042f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineToRelative(-4.041f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.733f, 1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                lineToRelative(-6.0f, -8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                lineToRelative(6.0f, -8.0f)
            }
        }
        .build()
        return `_brand-xamarin`!!
    }

private var `_brand-xamarin`: ImageVector? = null
