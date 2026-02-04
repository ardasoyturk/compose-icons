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

public val LucideIcons.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                horizontalLineToRelative(-2.48f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.93f, 1.46f)
                lineToRelative(-2.35f, 8.36f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.48f, 0.0f)
                lineTo(9.24f, 2.18f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.48f, 0.0f)
                lineToRelative(-2.35f, 8.36f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.49f, 12.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
