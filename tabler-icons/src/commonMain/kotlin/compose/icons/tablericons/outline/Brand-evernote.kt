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

public val OutlineGroup.`Brand-evernote`: ImageVector
    get() {
        if (`_brand-evernote` != null) {
            return `_brand-evernote`!!
        }
        `_brand-evernote` = Builder(name = "Brand-evernote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9f, 19.0f)
                curveToRelative(0.6f, -2.5f, 1.1f, -5.471f, 1.1f, -9.0f)
                curveToRelative(0.0f, -4.5f, -2.0f, -5.0f, -3.0f, -5.0f)
                curveToRelative(-1.906f, 0.0f, -3.0f, -0.5f, -3.5f, -1.0f)
                curveToRelative(-0.354f, -0.354f, -0.5f, -1.0f, -1.5f, -1.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(0.0f, 6.0f, 2.5f, 8.0f, 5.0f, 8.0f)
                curveToRelative(1.0f, 0.0f, 1.5f, -0.5f, 2.0f, -1.5f)
                reflectiveCurveToRelative(1.414f, -0.326f, 2.5f, 0.0f)
                curveToRelative(1.044f, 0.313f, 2.01f, 0.255f, 2.5f, 0.5f)
                curveToRelative(1.0f, 0.5f, 2.0f, 1.5f, 2.0f, 3.0f)
                curveToRelative(0.0f, 0.5f, 0.0f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -3.0f, -1.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(1.0f)
            }
        }
        .build()
        return `_brand-evernote`!!
    }

private var `_brand-evernote`: ImageVector? = null
