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

public val LucideIcons.IceCreamBowl: ImageVector
    get() {
        if (_iceCreamBowl != null) {
            return _iceCreamBowl!!
        }
        _iceCreamBowl = Builder(name = "IceCreamBowl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(5.0f, 0.0f, 8.0f, -2.69f, 8.0f, -6.0f)
                horizontalLineTo(4.0f)
                curveToRelative(0.0f, 3.31f, 3.0f, 6.0f, 8.0f, 6.0f)
                moveToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                moveToRelative(-4.0f, -3.0f)
                verticalLineToRelative(3.0f)
                moveTo(5.14f, 11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.71f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.14f, 11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.71f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
            }
        }
        .build()
        return _iceCreamBowl!!
    }

private var _iceCreamBowl: ImageVector? = null
