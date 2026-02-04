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

public val LucideIcons.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(16.0f, 6.0f)
                lineToRelative(-8.414f, 8.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.829f, 2.829f)
                lineToRelative(8.414f, -8.586f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.657f, -5.657f)
                lineToRelative(-8.379f, 8.551f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.485f, 8.485f)
                lineToRelative(8.379f, -8.551f)
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
