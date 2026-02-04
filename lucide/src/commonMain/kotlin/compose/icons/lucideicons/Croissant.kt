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

public val LucideIcons.Croissant: ImageVector
    get() {
        if (_croissant != null) {
            return _croissant!!
        }
        _croissant = Builder(name = "Croissant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.2f, 18.0f)
                horizontalLineTo(4.774f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.352f, -0.97f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 0.132f, -6.487f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 10.2f)
                verticalLineTo(4.774f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.97f, -1.352f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -6.486f, 0.132f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                arcToRelative(4.0f, 3.0f, 0.0f, false, true, 4.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -5.139f, 1.42f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                arcToRelative(3.0f, 4.0f, 0.0f, false, false, 3.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 1.42f, -5.14f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.709f, 2.554f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -6.155f, 6.155f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.676f, 1.626f)
                lineToRelative(9.807f, 5.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.718f, -2.718f)
                lineToRelative(-5.42f, -9.807f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.626f, -0.676f)
            }
        }
        .build()
        return _croissant!!
    }

private var _croissant: ImageVector? = null
