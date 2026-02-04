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

public val LucideIcons.MapPinned: ImageVector
    get() {
        if (_mapPinned != null) {
            return _mapPinned!!
        }
        _mapPinned = Builder(name = "MapPinned", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                curveToRelative(0.0f, 3.613f, -3.869f, 7.429f, -5.393f, 8.795f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.214f, 0.0f)
                curveTo(9.87f, 15.429f, 6.0f, 11.613f, 6.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.714f, 14.0f)
                horizontalLineToRelative(-3.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.948f, 0.683f)
                lineToRelative(-2.004f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 22.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.948f, -1.316f)
                lineToRelative(-2.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.949f, -0.684f)
                horizontalLineToRelative(-3.712f)
            }
        }
        .build()
        return _mapPinned!!
    }

private var _mapPinned: ImageVector? = null
