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

public val OutlineGroup.`Brand-feedly`: ImageVector
    get() {
        if (`_brand-feedly` != null) {
            return `_brand-feedly`!!
        }
        `_brand-feedly` = Builder(name = "Brand-feedly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.833f, 12.278f)
                lineToRelative(4.445f, -4.445f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.055f, 14.5f)
                lineToRelative(2.223f, -2.222f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.278f, 16.722f)
                lineToRelative(0.555f, -0.555f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.828f, 14.828f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.656f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.656f, 0.0f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.656f)
                lineToRelative(6.171f, 6.172f)
                horizontalLineToRelative(3.314f)
                lineToRelative(6.171f, -6.172f)
            }
        }
        .build()
        return `_brand-feedly`!!
    }

private var `_brand-feedly`: ImageVector? = null
