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

public val OutlineGroup.`Bone-off`: ImageVector
    get() {
        if (`_bone-off` != null) {
            return `_bone-off`!!
        }
        `_bone-off` = Builder(name = "Bone-off", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 8.502f)
                lineToRelative(0.38f, -0.38f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 5.12f, -2.122f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.12f, 5.122f)
                lineToRelative(-0.372f, 0.372f)
                moveToRelative(-2.008f, 2.008f)
                lineToRelative(-2.378f, 2.378f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -5.117f, 2.297f)
                lineToRelative(0.0f, -0.177f)
                lineToRelative(-0.176f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 2.298f, -5.115f)
                lineToRelative(2.378f, -2.378f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_bone-off`!!
    }

private var `_bone-off`: ImageVector? = null
