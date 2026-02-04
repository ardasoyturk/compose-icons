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

public val LucideIcons.Layers2: ImageVector
    get() {
        if (_layers2 != null) {
            return _layers2!!
        }
        _layers2 = Builder(name = "Layers2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 13.74f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(2.5f, 8.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.74f)
                lineTo(11.0f, 2.26f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(8.5f, 4.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(20.0f, 14.285f)
                lineToRelative(1.5f, 0.845f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.74f)
                lineTo(13.0f, 21.74f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineToRelative(-8.5f, -4.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.74f)
                lineToRelative(1.5f, -0.845f)
            }
        }
        .build()
        return _layers2!!
    }

private var _layers2: ImageVector? = null
