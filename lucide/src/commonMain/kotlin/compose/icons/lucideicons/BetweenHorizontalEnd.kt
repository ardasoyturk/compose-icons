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

public val LucideIcons.BetweenHorizontalEnd: ImageVector
    get() {
        if (_betweenHorizontalEnd != null) {
            return _betweenHorizontalEnd!!
        }
        _betweenHorizontalEnd = Builder(name = "BetweenHorizontalEnd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                lineTo(15.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 4.0f)
                lineTo(16.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                lineTo(3.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(22.0f, 15.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 15.0f)
                lineTo(16.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.0f)
                lineTo(3.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 14.0f)
                close()
            }
        }
        .build()
        return _betweenHorizontalEnd!!
    }

private var _betweenHorizontalEnd: ImageVector? = null
