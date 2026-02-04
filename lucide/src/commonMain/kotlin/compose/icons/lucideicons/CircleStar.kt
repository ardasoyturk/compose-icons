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

public val LucideIcons.CircleStar: ImageVector
    get() {
        if (_circleStar != null) {
            return _circleStar!!
        }
        _circleStar = Builder(name = "CircleStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.051f, 7.616f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.909f, 0.024f)
                lineToRelative(0.737f, 1.452f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.737f, 0.535f)
                lineToRelative(1.634f, 0.256f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.588f, 1.806f)
                lineToRelative(-1.172f, 1.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.282f, 0.866f)
                lineToRelative(0.259f, 1.613f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.541f, 1.134f)
                lineToRelative(-1.465f, -0.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.912f, 0.0f)
                lineToRelative(-1.465f, 0.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.539f, -1.133f)
                lineToRelative(0.258f, -1.613f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.282f, -0.867f)
                lineToRelative(-1.156f, -1.152f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.572f, -1.822f)
                lineToRelative(1.633f, -0.256f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.737f, -0.535f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
        }
        .build()
        return _circleStar!!
    }

private var _circleStar: ImageVector? = null
