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

public val LucideIcons.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.22f)
                curveTo(11.0f, 9.997f, 10.0f, 9.0f, 10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveToRelative(0.0f, 1.0f, -0.998f, 2.002f, -2.01f, 3.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(12.0f, 18.0f)
                lineToRelative(2.57f, -3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.243f, 9.016f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 11.507f, -0.009f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.35f, 14.53f)
                lineTo(12.0f, 11.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.35f, 14.53f)
                curveTo(7.728f, 12.246f, 6.0f, 10.221f, 6.0f, 7.0f)
                arcToRelative(6.0f, 5.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(-0.005f, 3.22f, -1.778f, 5.235f, -3.43f, 7.5f)
                lineToRelative(3.557f, 4.527f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.203f, 1.43f)
                lineToRelative(-1.894f, 1.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.384f, -0.215f)
                lineTo(12.0f, 18.0f)
                lineToRelative(-2.679f, 3.593f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.39f, 0.213f)
                lineToRelative(-1.865f, -1.353f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.203f, -1.422f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
