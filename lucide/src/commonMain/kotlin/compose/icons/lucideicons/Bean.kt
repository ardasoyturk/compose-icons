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

public val LucideIcons.Bean: ImageVector
    get() {
        if (_bean != null) {
            return _bean!!
        }
        _bean = Builder(name = "Bean", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.165f, 6.598f)
                curveTo(9.954f, 7.478f, 9.64f, 8.36f, 9.0f, 9.0f)
                curveToRelative(-0.64f, 0.64f, -1.521f, 0.954f, -2.402f, 1.165f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 22.0f)
                curveToRelative(7.732f, 0.0f, 14.0f, -6.268f, 14.0f, -14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.835f, -1.402f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.341f, 10.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.279f, -5.28f)
            }
        }
        .build()
        return _bean!!
    }

private var _bean: ImageVector? = null
