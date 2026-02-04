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

public val LucideIcons.Spool: ImageVector
    get() {
        if (_spool != null) {
            return _spool!!
        }
        _spool = Builder(name = "Spool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 13.44f)
                lineTo(4.442f, 17.082f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.982f, 21.0f)
                horizontalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.558f, -3.921f)
                lineToRelative(-1.115f, -0.32f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 14.837f)
                verticalLineTo(7.66f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(7.0f, 10.56f)
                lineToRelative(12.558f, -3.642f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.018f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.558f, 3.921f)
                lineToRelative(1.115f, 0.32f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 9.163f)
                verticalLineToRelative(7.178f)
            }
        }
        .build()
        return _spool!!
    }

private var _spool: ImageVector? = null
