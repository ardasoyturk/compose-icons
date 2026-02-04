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

public val LucideIcons.VectorSquare: ImageVector
    get() {
        if (_vectorSquare != null) {
            return _vectorSquare!!
        }
        _vectorSquare = Builder(name = "VectorSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 7.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 7.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 19.5f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 10.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 4.5f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 10.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 18.0f)
                lineTo(22.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 21.0f)
                lineTo(17.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 3.0f)
                lineTo(22.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 6.0f)
                lineTo(17.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 18.0f)
                lineTo(7.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 21.0f)
                lineTo(2.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 3.0f)
                lineTo(7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 6.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                close()
            }
        }
        .build()
        return _vectorSquare!!
    }

private var _vectorSquare: ImageVector? = null
