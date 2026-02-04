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

public val OutlineGroup.`Brand-bumble`: ImageVector
    get() {
        if (`_brand-bumble` != null) {
            return `_brand-bumble`!!
        }
        `_brand-bumble` = Builder(name = "Brand-bumble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.268f, 3.0f)
                horizontalLineToRelative(-8.536f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, -1.268f, 0.748f)
                lineToRelative(-4.268f, 7.509f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 0.0f, 1.486f)
                lineToRelative(4.268f, 7.509f)
                curveToRelative(0.26f, 0.462f, 0.744f, 0.747f, 1.268f, 0.748f)
                horizontalLineToRelative(8.536f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, 1.268f, -0.748f)
                lineToRelative(4.268f, -7.509f)
                arcToRelative(1.507f, 1.507f, 0.0f, false, false, 0.0f, -1.486f)
                lineToRelative(-4.268f, -7.509f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, -1.268f, -0.748f)
            }
        }
        .build()
        return `_brand-bumble`!!
    }

private var `_brand-bumble`: ImageVector? = null
