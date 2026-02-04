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

public val OutlineGroup.`Microphone-2`: ImageVector
    get() {
        if (`_microphone-2` != null) {
            return `_microphone-2`!!
        }
        `_microphone-2` = Builder(name = "Microphone-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.9f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -3.902f, -3.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.9f)
                lineToRelative(-3.902f, -3.899f)
                lineToRelative(-7.513f, 8.584f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.827f, 2.83f)
                lineToRelative(8.588f, -7.515f)
            }
        }
        .build()
        return `_microphone-2`!!
    }

private var `_microphone-2`: ImageVector? = null
