package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val FeatherIcons.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 7.0f)
                lineToRelative(-7.0f, 5.0f)
                lineToRelative(7.0f, 5.0f)
                lineToRelative(0.0f, -10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                lineTo(14.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 7.0f)
                lineTo(16.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 17.0f)
                lineTo(1.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 5.0f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
