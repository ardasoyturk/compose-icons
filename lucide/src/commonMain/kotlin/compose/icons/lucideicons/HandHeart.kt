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

public val LucideIcons.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = Builder(name = "HandHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.6f, 0.0f, -1.1f, 0.2f, -1.4f, 0.6f)
                lineTo(3.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(14.45f, 13.39f)
                lineToRelative(5.05f, -4.694f)
                curveTo(20.196f, 8.0f, 21.0f, 6.85f, 21.0f, 5.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -4.797f, -1.837f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, true, -0.406f, 0.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 11.0f, 5.75f)
                curveToRelative(0.0f, 1.2f, 0.802f, 2.248f, 1.5f, 2.946f)
                lineTo(16.0f, 11.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(2.0f, 15.0f)
                lineToRelative(6.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(7.0f, 20.0f)
                lineToRelative(1.6f, -1.4f)
                curveToRelative(0.3f, -0.4f, 0.8f, -0.6f, 1.4f, -0.6f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.1f, -0.4f, 2.8f, -1.2f)
                lineToRelative(4.6f, -4.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.75f, -2.91f)
            }
        }
        .build()
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
