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

public val LucideIcons.LibraryBig: ImageVector
    get() {
        if (_libraryBig != null) {
            return _libraryBig!!
        }
        _libraryBig = Builder(name = "LibraryBig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                lineTo(10.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 4.0f)
                lineTo(11.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.0f)
                lineTo(3.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                verticalLineToRelative(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.4f, 18.9f)
                curveToRelative(0.2f, 0.5f, -0.1f, 1.1f, -0.6f, 1.3f)
                lineToRelative(-1.9f, 0.7f)
                curveToRelative(-0.5f, 0.2f, -1.1f, -0.1f, -1.3f, -0.6f)
                lineTo(11.1f, 5.1f)
                curveToRelative(-0.2f, -0.5f, 0.1f, -1.1f, 0.6f, -1.3f)
                lineToRelative(1.9f, -0.7f)
                curveToRelative(0.5f, -0.2f, 1.1f, 0.1f, 1.3f, 0.6f)
                close()
            }
        }
        .build()
        return _libraryBig!!
    }

private var _libraryBig: ImageVector? = null
