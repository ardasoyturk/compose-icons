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

public val LucideIcons.Puzzle: ImageVector
    get() {
        if (_puzzle != null) {
            return _puzzle!!
        }
        _puzzle = Builder(name = "Puzzle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.39f, 4.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.68f, -0.474f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.014f, 3.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.474f, 1.68f)
                lineToRelative(1.683f, 1.682f)
                arcToRelative(2.414f, 2.414f, 0.0f, false, true, 0.0f, 3.414f)
                lineTo(19.61f, 15.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.68f, -0.474f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -3.014f, 3.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.474f, 1.68f)
                lineToRelative(-1.683f, 1.682f)
                arcToRelative(2.414f, 2.414f, 0.0f, false, true, -3.414f, 0.0f)
                lineTo(8.61f, 19.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.68f, 0.474f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.014f, -3.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.474f, -1.68f)
                lineToRelative(-1.683f, -1.682f)
                arcToRelative(2.414f, 2.414f, 0.0f, false, true, 0.0f, -3.414f)
                lineTo(4.39f, 8.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.68f, 0.474f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 3.014f, -3.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.474f, -1.68f)
                lineToRelative(1.683f, -1.682f)
                arcToRelative(2.414f, 2.414f, 0.0f, false, true, 3.414f, 0.0f)
                close()
            }
        }
        .build()
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
