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

public val LucideIcons.HeartHandshake: ImageVector
    get() {
        if (_heartHandshake != null) {
            return _heartHandshake!!
        }
        _heartHandshake = Builder(name = "HeartHandshake", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.414f, 14.414f)
                curveTo(21.0f, 12.828f, 22.0f, 11.5f, 22.0f, 9.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -9.591f, -3.676f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.818f, 0.001f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 2.0f, 9.5f)
                curveToRelative(0.0f, 2.3f, 1.5f, 4.0f, 3.0f, 5.5f)
                lineToRelative(5.535f, 5.362f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.879f, 0.052f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, false, -0.004f, -3.0f)
                arcToRelative(2.124f, 2.124f, 0.0f, true, false, 3.0f, -3.0f)
                arcToRelative(2.124f, 2.124f, 0.0f, false, false, 3.004f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.828f)
                lineToRelative(-1.881f, -1.882f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, -3.409f, 0.0f)
                lineToRelative(-1.71f, 1.71f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(2.823f, -2.762f)
            }
        }
        .build()
        return _heartHandshake!!
    }

private var _heartHandshake: ImageVector? = null
