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

public val OutlineGroup.`Inner-shadow-left`: ImageVector
    get() {
        if (`_inner-shadow-left` != null) {
            return `_inner-shadow-left`!!
        }
        `_inner-shadow-left` = Builder(name = "Inner-shadow-left", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.636f, 5.636f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 12.728f, 12.728f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -12.728f, -12.728f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.757f, 16.243f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.486f)
            }
        }
        .build()
        return `_inner-shadow-left`!!
    }

private var `_inner-shadow-left`: ImageVector? = null
