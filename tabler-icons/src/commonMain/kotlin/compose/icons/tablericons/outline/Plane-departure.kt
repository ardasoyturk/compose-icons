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

public val OutlineGroup.`Plane-departure`: ImageVector
    get() {
        if (`_plane-departure` != null) {
            return `_plane-departure`!!
        }
        `_plane-departure` = Builder(name = "Plane-departure", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.639f, 10.258f)
                lineToRelative(4.83f, -1.294f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 1.035f, 3.863f)
                lineToRelative(-14.489f, 3.883f)
                lineToRelative(-4.45f, -5.02f)
                lineToRelative(2.897f, -0.776f)
                lineToRelative(2.45f, 1.414f)
                lineToRelative(2.897f, -0.776f)
                lineToRelative(-3.743f, -6.244f)
                lineToRelative(2.898f, -0.777f)
                lineToRelative(5.675f, 5.727f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(18.0f)
            }
        }
        .build()
        return `_plane-departure`!!
    }

private var `_plane-departure`: ImageVector? = null
