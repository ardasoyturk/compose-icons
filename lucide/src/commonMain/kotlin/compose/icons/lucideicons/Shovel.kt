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

public val LucideIcons.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.56f, 4.56f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.122f)
                lineToRelative(-0.47f, 0.47f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.212f, -0.03f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.243f)
                lineToRelative(0.44f, -0.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-3.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, -0.707f)
                lineToRelative(3.355f, -3.355f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, true, 1.704f, 0.0f)
                lineToRelative(3.296f, 3.296f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, true, 0.0f, 1.704f)
                lineToRelative(-3.355f, 3.355f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.707f, 0.293f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(9.0f, 15.0f)
                lineToRelative(7.879f, -7.878f)
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
