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

public val LucideIcons.Footprints: ImageVector
    get() {
        if (_footprints != null) {
            return _footprints!!
        }
        _footprints = Builder(name = "Footprints", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(-2.38f)
                curveTo(4.0f, 11.5f, 2.97f, 10.5f, 3.0f, 8.0f)
                curveToRelative(0.03f, -2.72f, 1.49f, -6.0f, 4.5f, -6.0f)
                curveTo(9.37f, 2.0f, 10.0f, 3.8f, 10.0f, 5.5f)
                curveToRelative(0.0f, 3.11f, -2.0f, 5.66f, -2.0f, 8.68f)
                verticalLineTo(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0.0f, -2.12f, 1.03f, -3.12f, 1.0f, -5.62f)
                curveToRelative(-0.03f, -2.72f, -1.49f, -6.0f, -4.5f, -6.0f)
                curveTo(14.63f, 6.0f, 14.0f, 7.8f, 14.0f, 9.5f)
                curveToRelative(0.0f, 3.11f, 2.0f, 5.66f, 2.0f, 8.68f)
                verticalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(4.0f)
            }
        }
        .build()
        return _footprints!!
    }

private var _footprints: ImageVector? = null
