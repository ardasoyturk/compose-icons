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

public val LucideIcons.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 12.0f)
                curveToRelative(0.94f, -3.46f, 4.94f, -6.0f, 8.5f, -6.0f)
                curveToRelative(3.56f, 0.0f, 6.06f, 2.54f, 7.0f, 6.0f)
                curveToRelative(-0.94f, 3.47f, -3.44f, 6.0f, -7.0f, 6.0f)
                reflectiveCurveToRelative(-7.56f, -2.53f, -8.5f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                verticalLineToRelative(0.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.93f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, true, 0.0f, -11.86f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.67f)
                curveTo(7.0f, 8.0f, 5.58f, 5.97f, 2.73f, 5.5f)
                curveToRelative(-1.0f, 1.5f, -1.0f, 5.0f, 0.23f, 6.5f)
                curveToRelative(-1.24f, 1.5f, -1.24f, 5.0f, -0.23f, 6.5f)
                curveTo(5.58f, 18.03f, 7.0f, 16.0f, 7.0f, 13.33f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.46f, 7.26f)
                curveTo(10.2f, 5.88f, 9.17f, 4.24f, 8.0f, 3.0f)
                horizontalLineToRelative(5.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.98f, 1.67f)
                lineToRelative(0.23f, 1.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(16.01f, 17.93f)
                lineToRelative(-0.23f, 1.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.8f, 21.0f)
                horizontalLineTo(9.5f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, false, 1.49f, -3.98f)
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
