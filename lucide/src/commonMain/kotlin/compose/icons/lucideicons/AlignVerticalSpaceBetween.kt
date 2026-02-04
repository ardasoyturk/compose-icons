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

public val LucideIcons.AlignVerticalSpaceBetween: ImageVector
    get() {
        if (_alignVerticalSpaceBetween != null) {
            return _alignVerticalSpaceBetween!!
        }
        _alignVerticalSpaceBetween = Builder(name = "AlignVerticalSpaceBetween", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 17.0f)
                lineTo(19.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 19.0f)
                lineTo(5.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineTo(15.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 5.0f)
                lineTo(17.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                horizontalLineToRelative(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineToRelative(20.0f)
            }
        }
        .build()
        return _alignVerticalSpaceBetween!!
    }

private var _alignVerticalSpaceBetween: ImageVector? = null
