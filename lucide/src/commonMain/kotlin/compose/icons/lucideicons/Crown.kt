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

public val LucideIcons.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.562f, 3.266f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.876f, 0.0f)
                lineTo(15.39f, 8.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.516f, 0.294f)
                lineTo(21.183f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.798f, 0.519f)
                lineToRelative(-2.834f, 10.246f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.956f, 0.734f)
                horizontalLineTo(5.81f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.957f, -0.734f)
                lineTo(2.02f, 6.02f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.798f, -0.519f)
                lineToRelative(4.276f, 3.664f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.516f, -0.294f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
