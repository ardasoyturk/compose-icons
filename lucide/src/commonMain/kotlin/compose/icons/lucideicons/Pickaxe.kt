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

public val LucideIcons.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) {
            return _pickaxe!!
        }
        _pickaxe = Builder(name = "Pickaxe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(14.0f, 13.0f)
                lineToRelative(-8.381f, 8.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -3.001f, -3.0f)
                lineTo(11.0f, 9.999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.973f, 4.027f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 5.902f, 2.373f)
                curveToRelative(-1.398f, 0.342f, -1.092f, 2.158f, 0.277f, 2.601f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 5.822f, 3.024f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.001f, 11.999f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 3.024f, 5.824f)
                curveToRelative(0.444f, 1.369f, 2.26f, 1.676f, 2.603f, 0.278f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 20.0f, 8.069f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.352f, 3.352f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, false, -1.704f, 0.0f)
                lineToRelative(-5.296f, 5.296f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, false, 0.0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, false, 1.704f, 0.0f)
                lineToRelative(5.296f, -5.296f)
                arcToRelative(1.205f, 1.205f, 0.0f, false, false, 0.0f, -1.704f)
                close()
            }
        }
        .build()
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
