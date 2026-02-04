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

public val OutlineGroup.`Perspective-off`: ImageVector
    get() {
        if (`_perspective-off` != null) {
            return `_perspective-off`!!
        }
        `_perspective-off` = Builder(name = "Perspective-off", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.511f, 4.502f)
                lineToRelative(9.63f, 1.375f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.859f, 0.99f)
                verticalLineToRelative(8.133f)
                moveToRelative(-0.859f, 3.123f)
                lineToRelative(-12.0f, 1.714f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.141f, -0.99f)
                verticalLineToRelative(-13.694f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.01f, -0.137f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_perspective-off`!!
    }

private var `_perspective-off`: ImageVector? = null
