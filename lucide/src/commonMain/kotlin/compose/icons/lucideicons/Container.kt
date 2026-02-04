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

public val LucideIcons.Container: ImageVector
    get() {
        if (_container != null) {
            return _container!!
        }
        _container = Builder(name = "Container", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.7f)
                curveToRelative(0.0f, -0.6f, -0.4f, -1.2f, -0.8f, -1.5f)
                lineToRelative(-6.3f, -3.9f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, -1.7f, 0.0f)
                lineToRelative(-10.3f, 6.0f)
                curveToRelative(-0.5f, 0.2f, -0.9f, 0.8f, -0.9f, 1.4f)
                verticalLineToRelative(6.6f)
                curveToRelative(0.0f, 0.5f, 0.4f, 1.2f, 0.8f, 1.5f)
                lineToRelative(6.3f, 3.9f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 1.7f, 0.0f)
                lineToRelative(10.3f, -6.0f)
                curveToRelative(0.5f, -0.3f, 0.9f, -1.0f, 0.9f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.9f)
                verticalLineTo(14.0f)
                lineTo(2.1f, 9.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(10.0f, 14.0f)
                lineToRelative(11.9f, -6.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 19.8f)
                verticalLineToRelative(-8.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 17.5f)
                verticalLineTo(9.4f)
            }
        }
        .build()
        return _container!!
    }

private var _container: ImageVector? = null
