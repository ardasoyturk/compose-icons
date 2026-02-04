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

public val OutlineGroup.`Send-off`: ImageVector
    get() {
        if (`_send-off` != null) {
            return `_send-off`!!
        }
        `_send-off` = Builder(name = "Send-off", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                lineToRelative(2.0f, -2.0f)
                moveToRelative(2.0f, -2.0f)
                lineToRelative(7.0f, -7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.718f, 6.713f)
                lineToRelative(10.282f, -3.713f)
                lineToRelative(-3.715f, 10.289f)
                moveToRelative(-1.063f, 2.941f)
                lineToRelative(-1.722f, 4.77f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -1.0f, 0.0f)
                lineToRelative(-3.5f, -7.0f)
                lineToRelative(-7.0f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(4.772f, -1.723f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_send-off`!!
    }

private var `_send-off`: ImageVector? = null
