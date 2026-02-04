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

public val OutlineGroup.`Device-computer-camera-off`: ImageVector
    get() {
        if (`_device-computer-camera-off` != null) {
            return `_device-computer-camera-off`!!
        }
        `_device-computer-camera-off` = Builder(name = "Device-computer-camera-off", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.15f, 6.153f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.696f, 9.696f)
                moveToRelative(2.0f, -2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.699f, -9.695f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.13f, 9.122f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.743f, 3.749f)
                moveToRelative(2.0f, -2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.737f, -3.736f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                lineToRelative(-2.091f, 3.486f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.857f, 1.514f)
                horizontalLineToRelative(10.468f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.857f, -1.514f)
                lineToRelative(-2.091f, -3.486f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_device-computer-camera-off`!!
    }

private var `_device-computer-camera-off`: ImageVector? = null
