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

public val LucideIcons.MapMinus: ImageVector
    get() {
        if (_mapMinus != null) {
            return _mapMinus!!
        }
        _mapMinus = Builder(name = "MapMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(11.0f, 19.0f)
                lineToRelative(-1.106f, -0.552f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.788f, 0.0f)
                lineToRelative(-3.659f, 1.83f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 19.381f)
                verticalLineTo(6.618f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.553f, -0.894f)
                lineToRelative(4.553f, -2.277f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.788f, 0.0f)
                lineToRelative(4.212f, 2.106f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.788f, 0.0f)
                lineToRelative(3.659f, -1.83f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 4.619f)
                verticalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 5.764f)
                verticalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 3.236f)
                verticalLineToRelative(15.0f)
            }
        }
        .build()
        return _mapMinus!!
    }

private var _mapMinus: ImageVector? = null
