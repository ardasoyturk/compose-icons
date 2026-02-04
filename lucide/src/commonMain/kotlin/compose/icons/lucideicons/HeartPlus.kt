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

public val LucideIcons.HeartPlus: ImageVector
    get() {
        if (_heartPlus != null) {
            return _heartPlus!!
        }
        _heartPlus = Builder(name = "HeartPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(14.479f, 19.374f)
                lineToRelative(-0.971f, 0.939f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 0.019f)
                lineTo(5.0f, 15.0f)
                curveToRelative(-1.5f, -1.5f, -3.0f, -3.2f, -3.0f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 9.591f, -3.676f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.818f, 0.0f)
                arcTo(5.49f, 5.49f, 0.0f, false, true, 22.0f, 9.5f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -0.219f, 1.49f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _heartPlus!!
    }

private var _heartPlus: ImageVector? = null
