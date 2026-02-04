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

public val LucideIcons.LeafyGreen: ImageVector
    get() {
        if (_leafyGreen != null) {
            return _leafyGreen!!
        }
        _leafyGreen = Builder(name = "LeafyGreen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                curveToRelative(1.25f, -0.987f, 2.27f, -1.975f, 3.9f, -2.2f)
                arcToRelative(5.56f, 5.56f, 0.0f, false, true, 3.8f, 1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.187f, -2.353f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.69f, -5.116f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.95f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 16.0f, 3.05f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -5.831f, 1.373f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -5.116f, 3.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.348f, 6.155f)
                curveTo(3.499f, 15.42f, 4.409f, 16.712f, 4.2f, 18.1f)
                curveTo(3.926f, 19.743f, 3.014f, 20.732f, 2.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineTo(17.0f, 7.0f)
            }
        }
        .build()
        return _leafyGreen!!
    }

private var _leafyGreen: ImageVector? = null
