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

public val LucideIcons.ToolCase: ImageVector
    get() {
        if (_toolCase != null) {
            return _toolCase!!
        }
        _toolCase = Builder(name = "ToolCase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(14.817f, 10.995f)
                lineToRelative(-0.971f, -1.45f)
                lineToRelative(1.034f, -1.232f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.025f, -3.238f)
                lineToRelative(-1.82f, 0.364f)
                lineTo(9.91f, 3.885f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.625f, 0.748f)
                lineTo(6.141f, 6.55f)
                lineToRelative(-1.725f, 0.426f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.19f, 3.756f)
                lineToRelative(0.657f, 0.27f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(18.822f, 10.995f)
                lineToRelative(2.26f, -5.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.557f, -1.318f)
                lineTo(16.954f, 2.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.281f, 0.533f)
                lineToRelative(-0.924f, 2.122f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.006f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.994f, 11.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _toolCase!!
    }

private var _toolCase: ImageVector? = null
