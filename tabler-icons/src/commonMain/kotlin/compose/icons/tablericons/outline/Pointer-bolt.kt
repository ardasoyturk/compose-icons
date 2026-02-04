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

public val OutlineGroup.`Pointer-bolt`: ImageVector
    get() {
        if (`_pointer-bolt` != null) {
            return `_pointer-bolt`!!
        }
        `_pointer-bolt` = Builder(name = "Pointer-bolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.044f, 13.488f)
                lineToRelative(-1.266f, -1.266f)
                lineToRelative(3.113f, -2.09f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.309f, -2.228f)
                lineToRelative(-13.582f, -3.904f)
                lineToRelative(3.904f, 13.563f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 2.228f, 0.308f)
                lineToRelative(2.09f, -3.093f)
                lineToRelative(1.678f, 1.678f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                lineToRelative(-2.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.0f, 3.0f)
            }
        }
        .build()
        return `_pointer-bolt`!!
    }

private var `_pointer-bolt`: ImageVector? = null
