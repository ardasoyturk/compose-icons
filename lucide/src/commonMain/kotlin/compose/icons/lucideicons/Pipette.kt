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

public val LucideIcons.Pipette: ImageVector
    get() {
        if (_pipette != null) {
            return _pipette!!
        }
        _pipette = Builder(name = "Pipette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(12.0f, 9.0f)
                lineToRelative(-8.414f, 8.414f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 18.828f)
                verticalLineToRelative(1.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.586f, 1.414f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.828f, 21.0f)
                horizontalLineToRelative(1.344f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.414f, -0.586f)
                lineTo(15.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(18.0f, 9.0f)
                lineToRelative(0.4f, 0.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -3.0f, 3.0f)
                lineToRelative(-3.8f, -3.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 3.0f, -3.0f)
                lineToRelative(0.4f, 0.4f)
                lineToRelative(3.4f, -3.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 22.0f)
                lineToRelative(0.414f, -0.414f)
            }
        }
        .build()
        return _pipette!!
    }

private var _pipette: ImageVector? = null
