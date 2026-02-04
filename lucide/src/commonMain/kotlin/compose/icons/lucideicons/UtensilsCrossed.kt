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

public val LucideIcons.UtensilsCrossed: ImageVector
    get() {
        if (_utensilsCrossed != null) {
            return _utensilsCrossed!!
        }
        _utensilsCrossed = Builder(name = "UtensilsCrossed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(16.0f, 2.0f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.2f)
                lineToRelative(1.8f, 1.8f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.2f, 0.0f)
                lineTo(22.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                lineTo(3.3f, 3.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, 6.0f)
                lineToRelative(7.3f, 7.3f)
                curveToRelative(0.7f, 0.7f, 2.0f, 0.7f, 2.8f, 0.0f)
                lineTo(15.0f, 15.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(22.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.1f, 21.8f)
                lineToRelative(6.4f, -6.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(19.0f, 5.0f)
                lineToRelative(-7.0f, 7.0f)
            }
        }
        .build()
        return _utensilsCrossed!!
    }

private var _utensilsCrossed: ImageVector? = null
