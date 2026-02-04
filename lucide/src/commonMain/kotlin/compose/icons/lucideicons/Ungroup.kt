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

public val LucideIcons.Ungroup: ImageVector
    get() {
        if (_ungroup != null) {
            return _ungroup!!
        }
        _ungroup = Builder(name = "Ungroup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(12.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 5.0f)
                lineTo(13.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 9.0f)
                lineTo(5.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 15.0f)
                lineTo(19.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 20.0f)
                lineTo(12.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 19.0f)
                lineTo(11.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _ungroup!!
    }

private var _ungroup: ImageVector? = null
