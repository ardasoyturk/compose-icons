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

public val LucideIcons.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.528f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.237f, 21.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 22.0f, 11.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.0f, -4.472f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 11.0f)
                arcToRelative(15.1f, 15.1f, 0.0f, false, false, 3.763f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.648f, 0.648f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.178f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.237f, 21.0f)
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
