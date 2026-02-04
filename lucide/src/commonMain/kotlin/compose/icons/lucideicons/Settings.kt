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

public val LucideIcons.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.671f, 4.136f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, 4.659f, 0.0f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 3.319f, 1.915f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, 2.33f, 4.033f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 0.0f, 3.831f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -2.33f, 4.033f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, -3.319f, 1.915f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -4.659f, 0.0f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, -3.32f, -1.915f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -2.33f, -4.033f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 0.0f, -3.831f)
                arcTo(2.34f, 2.34f, 0.0f, false, true, 6.35f, 6.051f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 3.319f, -1.915f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
