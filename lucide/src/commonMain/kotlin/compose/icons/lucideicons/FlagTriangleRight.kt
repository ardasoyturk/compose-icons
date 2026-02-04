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

public val LucideIcons.FlagTriangleRight: ImageVector
    get() {
        if (_flagTriangleRight != null) {
            return _flagTriangleRight!!
        }
        _flagTriangleRight = Builder(name = "FlagTriangleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                verticalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 1.17f, -0.71f)
                lineToRelative(11.38f, 5.69f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.0f, 1.44f)
                lineTo(6.0f, 15.5f)
            }
        }
        .build()
        return _flagTriangleRight!!
    }

private var _flagTriangleRight: ImageVector? = null
