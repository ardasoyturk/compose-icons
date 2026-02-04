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

public val LucideIcons.BetweenHorizontalStart: ImageVector
    get() {
        if (_betweenHorizontalStart != null) {
            return _betweenHorizontalStart!!
        }
        _betweenHorizontalStart = Builder(name = "BetweenHorizontalStart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineTo(20.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 4.0f)
                lineTo(21.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 9.0f)
                lineTo(8.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 9.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 15.0f)
                lineTo(21.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 20.0f)
                lineTo(8.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 14.0f)
                close()
            }
        }
        .build()
        return _betweenHorizontalStart!!
    }

private var _betweenHorizontalStart: ImageVector? = null
