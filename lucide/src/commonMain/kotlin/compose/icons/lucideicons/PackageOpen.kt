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

public val LucideIcons.PackageOpen: ImageVector
    get() {
        if (_packageOpen != null) {
            return _packageOpen!!
        }
        _packageOpen = Builder(name = "PackageOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineToRelative(-9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.17f, 2.21f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 1.63f, 0.0f)
                lineTo(21.0f, 4.57f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 0.0f, 3.36f)
                lineTo(8.82f, 14.79f)
                arcToRelative(1.655f, 1.655f, 0.0f, false, true, -1.64f, 0.0f)
                lineTo(3.0f, 12.43f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 0.0f, -3.36f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                verticalLineToRelative(3.87f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, -1.11f, 1.83f)
                lineToRelative(-6.0f, 3.08f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.78f, 0.0f)
                lineToRelative(-6.0f, -3.08f)
                arcTo(2.06f, 2.06f, 0.0f, false, true, 4.0f, 16.87f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.43f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, 0.0f, -3.36f)
                lineTo(8.83f, 2.2f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, false, -1.63f, 0.0f)
                lineTo(3.0f, 4.57f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, 0.0f, 3.36f)
                lineToRelative(12.18f, 6.86f)
                arcToRelative(1.636f, 1.636f, 0.0f, false, false, 1.63f, 0.0f)
                close()
            }
        }
        .build()
        return _packageOpen!!
    }

private var _packageOpen: ImageVector? = null
