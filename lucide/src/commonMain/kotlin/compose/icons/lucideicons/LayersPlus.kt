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

public val LucideIcons.LayersPlus: ImageVector
    get() {
        if (_layersPlus != null) {
            return _layersPlus!!
        }
        _layersPlus = Builder(name = "LayersPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.83f, 2.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.66f, 0.0f)
                lineTo(2.6f, 6.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.83f)
                lineToRelative(8.58f, 3.91f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.83f, 0.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.83f, -0.18f)
                lineToRelative(8.58f, -3.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.831f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                verticalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.58f, 0.91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.825f, 0.178f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.58f, 0.91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.65f, 0.0f)
                lineToRelative(2.116f, -0.962f)
            }
        }
        .build()
        return _layersPlus!!
    }

private var _layersPlus: ImageVector? = null
