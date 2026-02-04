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

public val OutlineGroup.`Color-filter`: ImageVector
    get() {
        if (`_color-filter` != null) {
            return `_color-filter`!!
        }
        `_color-filter` = Builder(name = "Color-filter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.58f, 13.79f)
                curveToRelative(0.27f, 0.68f, 0.42f, 1.43f, 0.42f, 2.21f)
                curveToRelative(0.0f, 1.77f, -0.77f, 3.37f, -2.0f, 4.46f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, -4.0f, 1.54f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.76f, 1.88f, -5.1f, 4.42f, -5.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.58f, 10.21f)
                curveToRelative(2.54f, 0.69f, 4.42f, 3.03f, 4.42f, 5.79f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, -4.0f, -1.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -12.0f, 0.0f)
            }
        }
        .build()
        return `_color-filter`!!
    }

private var `_color-filter`: ImageVector? = null
