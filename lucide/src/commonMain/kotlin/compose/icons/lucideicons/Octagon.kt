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

public val LucideIcons.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.586f, 16.726f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 15.312f)
                verticalLineTo(8.688f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.586f, -1.414f)
                lineToRelative(4.688f, -4.688f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.688f, 2.0f)
                horizontalLineToRelative(6.624f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineToRelative(4.688f, 4.688f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 8.688f)
                verticalLineToRelative(6.624f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.586f, 1.414f)
                lineToRelative(-4.688f, 4.688f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.414f, 0.586f)
                horizontalLineTo(8.688f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.414f, -0.586f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
