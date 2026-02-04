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

public val LucideIcons.CandyOff: ImageVector
    get() {
        if (_candyOff != null) {
            return _candyOff!!
        }
        _candyOff = Builder(name = "CandyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                verticalLineToRelative(7.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.802f, 6.145f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 6.053f, 6.053f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 6.1f)
                verticalLineToRelative(2.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(15.5f, 15.571f)
                lineToRelative(-0.964f, 0.964f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -7.071f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -7.07f)
                lineToRelative(0.964f, -0.965f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.707f, -0.707f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.152f, 0.717f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.131f, 1.131f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.717f, 2.152f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 2.0f)
                lineToRelative(20.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.707f, 0.707f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.152f, -0.717f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.131f, -1.131f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.717f, -2.152f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 16.0f)
                horizontalLineToRelative(4.0f)
            }
        }
        .build()
        return _candyOff!!
    }

private var _candyOff: ImageVector? = null
