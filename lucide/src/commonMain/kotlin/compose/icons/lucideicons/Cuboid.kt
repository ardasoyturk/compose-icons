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

public val LucideIcons.Cuboid: ImageVector
    get() {
        if (_cuboid != null) {
            return _cuboid!!
        }
        _cuboid = Builder(name = "Cuboid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(21.12f, 6.4f)
                lineToRelative(-6.05f, -4.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.17f, -0.05f)
                lineTo(2.95f, 8.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.95f, 1.7f)
                verticalLineToRelative(5.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.88f, 1.66f)
                lineToRelative(6.05f, 4.07f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.17f, 0.05f)
                lineToRelative(9.95f, -6.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.95f, -1.7f)
                verticalLineTo(8.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.88f, -1.66f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                verticalLineToRelative(-8.0f)
                lineTo(2.25f, 9.15f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(10.0f, 14.0f)
                lineToRelative(11.77f, -6.87f)
            }
        }
        .build()
        return _cuboid!!
    }

private var _cuboid: ImageVector? = null
