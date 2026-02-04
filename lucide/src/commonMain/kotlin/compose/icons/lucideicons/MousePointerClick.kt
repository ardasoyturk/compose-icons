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

public val LucideIcons.MousePointerClick: ImageVector
    get() {
        if (_mousePointerClick != null) {
            return _mousePointerClick!!
        }
        _mousePointerClick = Builder(name = "MousePointerClick", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.1f)
                lineTo(12.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(5.1f, 8.0f)
                lineToRelative(-2.9f, -0.8f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(6.0f, 12.0f)
                lineToRelative(-1.9f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2f, 2.2f)
                lineTo(8.0f, 5.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.037f, 9.69f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, 0.653f, -0.653f)
                lineToRelative(11.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.074f, 0.949f)
                lineToRelative(-4.349f, 1.041f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.74f, 0.739f)
                lineToRelative(-1.04f, 4.35f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.95f, 0.074f)
                close()
            }
        }
        .build()
        return _mousePointerClick!!
    }

private var _mousePointerClick: ImageVector? = null
