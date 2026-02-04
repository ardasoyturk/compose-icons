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

public val LucideIcons.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 17.0f)
                arcToRelative(24.12f, 24.12f, 0.0f, false, true, 0.0f, -10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, -1.4f)
                arcToRelative(49.56f, 49.56f, 0.0f, false, true, 16.2f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.5f, 7.0f)
                arcToRelative(24.12f, 24.12f, 0.0f, false, true, 0.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 1.4f)
                arcToRelative(49.55f, 49.55f, 0.0f, false, true, -16.2f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.5f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(10.0f, 15.0f)
                lineToRelative(5.0f, -3.0f)
                lineToRelative(-5.0f, -3.0f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
