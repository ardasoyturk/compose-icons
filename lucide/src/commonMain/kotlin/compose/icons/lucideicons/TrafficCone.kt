package compose.icons.lucideicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LucideIcons
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val LucideIcons.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.05f, 10.966f)
                arcToRelative(5.0f, 2.5f, 0.0f, false, true, -8.1f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(16.923f, 14.049f)
                lineToRelative(4.48f, 2.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.001f, 1.831f)
                lineToRelative(-8.574f, 3.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.66f, 0.0f)
                lineToRelative(-8.574f, -3.91f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.83f)
                lineToRelative(4.484f, -2.04f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.949f, 14.14f)
                arcToRelative(5.0f, 2.5f, 0.0f, true, true, -9.9f, 0.0f)
                lineTo(10.063f, 3.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.874f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.194f, 6.57f)
                arcToRelative(5.0f, 2.5f, 0.0f, false, false, 5.61f, 0.0f)
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
