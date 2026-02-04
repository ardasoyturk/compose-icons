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

public val LucideIcons.PlaneTakeoff: ImageVector
    get() {
        if (_planeTakeoff != null) {
            return _planeTakeoff!!
        }
        _planeTakeoff = Builder(name = "PlaneTakeoff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineToRelative(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.36f, 17.4f)
                lineTo(4.0f, 17.0f)
                lineToRelative(-2.0f, -4.0f)
                lineToRelative(1.1f, -0.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.8f, 0.0f)
                lineToRelative(0.17f, 0.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.8f, 0.0f)
                lineTo(8.0f, 12.0f)
                lineTo(5.0f, 6.0f)
                lineToRelative(0.9f, -0.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.09f, 0.2f)
                lineToRelative(4.02f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.1f, 0.2f)
                lineToRelative(4.19f, -2.06f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, 1.73f, -0.17f)
                lineTo(21.0f, 7.0f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 0.87f, 1.99f)
                lineToRelative(-0.38f, 0.76f)
                curveToRelative(-0.23f, 0.46f, -0.6f, 0.84f, -1.07f, 1.08f)
                lineTo(7.58f, 17.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.22f, 0.18f)
                close()
            }
        }
        .build()
        return _planeTakeoff!!
    }

private var _planeTakeoff: ImageVector? = null
