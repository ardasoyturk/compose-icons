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

public val OutlineGroup.`Bell-ringing-2`: ImageVector
    get() {
        if (`_bell-ringing-2` != null) {
            return `_bell-ringing-2`!!
        }
        `_bell-ringing-2` = Builder(name = "Bell-ringing-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.364f, 4.636f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.414f, 7.072f)
                lineToRelative(-2.122f, 2.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.707f, 3.536f)
                lineToRelative(-11.313f, -11.312f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.535f, -0.707f)
                lineToRelative(2.121f, -2.123f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.072f, -1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.343f, 12.414f)
                lineToRelative(-0.707f, 0.707f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 4.243f)
                lineToRelative(0.707f, -0.707f)
            }
        }
        .build()
        return `_bell-ringing-2`!!
    }

private var `_bell-ringing-2`: ImageVector? = null
