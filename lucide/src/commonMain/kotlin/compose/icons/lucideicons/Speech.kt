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

public val LucideIcons.Speech: ImageVector
    get() {
        if (_speech != null) {
            return _speech!!
        }
        _speech = Builder(name = "Speech", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.8f, 20.0f)
                verticalLineToRelative(-4.1f)
                lineToRelative(1.9f, 0.2f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 2.164f, -2.1f)
                verticalLineTo(8.3f)
                arcTo(5.37f, 5.37f, 0.0f, false, false, 2.0f, 8.25f)
                curveToRelative(0.0f, 2.8f, 0.656f, 3.054f, 1.0f, 4.55f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, true, 0.029f, 2.758f)
                lineTo(2.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8f, 17.8f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.003f, -10.603f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.025f, -4.975f)
            }
        }
        .build()
        return _speech!!
    }

private var _speech: ImageVector? = null
