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

public val LucideIcons.Beef: ImageVector
    get() {
        if (_beef != null) {
            return _beef!!
        }
        _beef = Builder(name = "Beef", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.4f, 13.7f)
                arcTo(6.5f, 6.5f, 0.0f, true, false, 6.28f, 6.6f)
                curveToRelative(-1.1f, 3.13f, -0.78f, 3.9f, -3.18f, 6.08f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 18.0f)
                curveToRelative(4.0f, 0.0f, 8.4f, -1.8f, 11.4f, -4.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(18.5f, 6.0f)
                lineToRelative(2.19f, 4.5f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, -2.29f, 7.2f)
                curveTo(15.4f, 20.2f, 11.0f, 22.0f, 7.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.68f, -1.66f)
                lineTo(2.4f, 16.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 8.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
        }
        .build()
        return _beef!!
    }

private var _beef: ImageVector? = null
