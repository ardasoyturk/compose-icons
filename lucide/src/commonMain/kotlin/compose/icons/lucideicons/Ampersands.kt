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

public val LucideIcons.Ampersands: ImageVector
    get() {
        if (_ampersands != null) {
            return _ampersands!!
        }
        _ampersands = Builder(name = "Ampersands", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 17.0f)
                curveToRelative(-5.0f, -3.0f, -7.0f, -7.0f, -7.0f, -9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveToRelative(0.0f, 2.5f, -5.0f, 2.5f, -5.0f, 6.0f)
                curveToRelative(0.0f, 1.7f, 1.3f, 3.0f, 3.0f, 3.0f)
                curveToRelative(2.8f, 0.0f, 5.0f, -2.2f, 5.0f, -5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                curveToRelative(-5.0f, -3.0f, -7.0f, -7.0f, -7.0f, -9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveToRelative(0.0f, 2.5f, -5.0f, 2.5f, -5.0f, 6.0f)
                curveToRelative(0.0f, 1.7f, 1.3f, 3.0f, 3.0f, 3.0f)
                curveToRelative(2.8f, 0.0f, 5.0f, -2.2f, 5.0f, -5.0f)
            }
        }
        .build()
        return _ampersands!!
    }

private var _ampersands: ImageVector? = null
