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

public val OutlineGroup.`Road-sign`: ImageVector
    get() {
        if (`_road-sign` != null) {
            return `_road-sign`!!
        }
        `_road-sign` = Builder(name = "Road-sign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.446f, 2.6f)
                lineToRelative(7.955f, 7.954f)
                arcToRelative(2.045f, 2.045f, 0.0f, false, true, 0.0f, 2.892f)
                lineToRelative(-7.955f, 7.955f)
                arcToRelative(2.045f, 2.045f, 0.0f, false, true, -2.892f, 0.0f)
                lineToRelative(-7.955f, -7.955f)
                arcToRelative(2.045f, 2.045f, 0.0f, false, true, 0.0f, -2.892f)
                lineToRelative(7.955f, -7.955f)
                arcToRelative(2.045f, 2.045f, 0.0f, false, true, 2.892f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.59f, 0.414f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(-2.0f, 2.0f)
            }
        }
        .build()
        return `_road-sign`!!
    }

private var `_road-sign`: ImageVector? = null
