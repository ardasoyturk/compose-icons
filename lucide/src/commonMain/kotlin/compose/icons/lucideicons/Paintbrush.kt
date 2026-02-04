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

public val LucideIcons.Paintbrush: ImageVector
    get() {
        if (_paintbrush != null) {
            return _paintbrush!!
        }
        _paintbrush = Builder(name = "Paintbrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(14.622f, 17.897f)
                lineToRelative(-10.68f, -2.913f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.376f, 2.622f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 3.002f, 3.002f)
                lineTo(17.36f, 9.643f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                lineToRelative(0.944f, 0.944f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, 0.0f, 3.408f)
                lineToRelative(-0.944f, 0.944f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineTo(8.354f, 7.348f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                lineToRelative(0.944f, -0.944f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, 3.408f, 0.0f)
                lineToRelative(0.944f, 0.944f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                curveToRelative(-1.804f, 2.71f, -3.97f, 3.46f, -6.583f, 3.948f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, -0.302f, 0.819f)
                lineToRelative(7.32f, 8.883f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.185f, 0.204f)
                curveTo(12.735f, 20.405f, 16.0f, 16.792f, 16.0f, 15.0f)
            }
        }
        .build()
        return _paintbrush!!
    }

private var _paintbrush: ImageVector? = null
