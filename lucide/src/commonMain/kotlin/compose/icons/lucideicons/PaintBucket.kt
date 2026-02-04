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

public val LucideIcons.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                lineTo(6.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.992f, 12.0f)
                horizontalLineTo(2.041f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.145f, 18.38f)
                arcTo(3.34f, 3.34f, 0.0f, false, true, 20.0f, 16.5f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -1.145f, 1.88f)
                curveToRelative(-0.575f, 0.46f, -0.855f, 1.02f, -0.855f, 1.595f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.025f)
                curveToRelative(0.0f, -0.58f, -0.285f, -1.13f, -0.855f, -1.595f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(8.5f, 4.5f)
                lineToRelative(2.148f, -2.148f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, true, 1.704f, 0.0f)
                lineToRelative(7.296f, 7.296f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, true, 0.0f, 1.704f)
                lineToRelative(-7.592f, 7.592f)
                arcToRelative(3.615f, 3.615f, 0.0f, false, true, -5.112f, 0.0f)
                lineToRelative(-3.888f, -3.888f)
                arcToRelative(3.615f, 3.615f, 0.0f, false, true, 0.0f, -5.112f)
                lineTo(5.67f, 7.33f)
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
