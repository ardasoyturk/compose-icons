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

public val OutlineGroup.`Brand-sass`: ImageVector
    get() {
        if (`_brand-sass` != null) {
            return `_brand-sass`!!
        }
        `_brand-sass` = Builder(name = "Brand-sass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -18.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.523f)
                curveToRelative(2.46f, -0.826f, 4.0f, -0.826f, 4.0f, -2.155f)
                curveToRelative(0.0f, -1.366f, -1.347f, -1.366f, -2.735f, -1.366f)
                curveToRelative(-1.91f, 0.0f, -3.352f, 0.49f, -4.537f, 1.748f)
                curveToRelative(-0.848f, 0.902f, -1.027f, 2.449f, -0.153f, 3.307f)
                curveToRelative(0.973f, 0.956f, 3.206f, 1.789f, 2.884f, 3.493f)
                curveToRelative(-0.233f, 1.235f, -1.469f, 1.823f, -2.617f, 1.202f)
                curveToRelative(-0.782f, -0.424f, -0.454f, -1.746f, 0.626f, -2.512f)
                reflectiveCurveToRelative(2.822f, -0.992f, 4.1f, -0.24f)
                curveToRelative(0.98f, 0.575f, 1.046f, 1.724f, 0.434f, 2.193f)
            }
        }
        .build()
        return `_brand-sass`!!
    }

private var `_brand-sass`: ImageVector? = null
