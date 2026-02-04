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

public val LucideIcons.BadgePoundSterling: ImageVector
    get() {
        if (_badgePoundSterling != null) {
            return _badgePoundSterling!!
        }
        _badgePoundSterling = Builder(name = "BadgePoundSterling", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.85f, 8.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.78f, -4.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.74f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.78f, 4.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.77f, 4.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.75f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.78f, -4.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -6.76f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                verticalLineTo(9.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(7.0f)
            }
        }
        .build()
        return _badgePoundSterling!!
    }

private var _badgePoundSterling: ImageVector? = null
