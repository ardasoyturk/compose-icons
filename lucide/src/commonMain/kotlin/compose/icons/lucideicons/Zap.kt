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

public val LucideIcons.Zap: ImageVector
    get() {
        if (_zap != null) {
            return _zap!!
        }
        _zap = Builder(name = "Zap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.78f, -1.63f)
                lineToRelative(9.9f, -10.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.86f, 0.46f)
                lineToRelative(-1.92f, 6.02f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.78f, 1.63f)
                lineToRelative(-9.9f, 10.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.86f, -0.46f)
                lineToRelative(1.92f, -6.02f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 14.0f)
                close()
            }
        }
        .build()
        return _zap!!
    }

private var _zap: ImageVector? = null
