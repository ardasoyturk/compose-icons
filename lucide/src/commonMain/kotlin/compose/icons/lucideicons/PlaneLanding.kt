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

public val LucideIcons.PlaneLanding: ImageVector
    get() {
        if (_planeLanding != null) {
            return _planeLanding!!
        }
        _planeLanding = Builder(name = "PlaneLanding", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(3.77f, 10.77f)
                lineTo(2.0f, 9.0f)
                lineToRelative(2.0f, -4.5f)
                lineToRelative(1.1f, 0.55f)
                curveToRelative(0.55f, 0.28f, 0.9f, 0.84f, 0.9f, 1.45f)
                reflectiveCurveToRelative(0.35f, 1.17f, 0.9f, 1.45f)
                lineTo(8.0f, 8.5f)
                lineToRelative(3.0f, -6.0f)
                lineToRelative(1.05f, 0.53f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.09f, 1.52f)
                lineToRelative(0.72f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.09f, 1.52f)
                lineToRelative(4.4f, 2.2f)
                curveToRelative(0.42f, 0.22f, 0.78f, 0.55f, 1.01f, 0.96f)
                lineToRelative(0.6f, 1.03f)
                curveToRelative(0.49f, 0.88f, -0.06f, 1.98f, -1.06f, 2.1f)
                lineToRelative(-1.18f, 0.15f)
                curveToRelative(-0.47f, 0.06f, -0.95f, -0.02f, -1.37f, -0.24f)
                lineTo(4.29f, 11.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.52f, -0.38f)
                close()
            }
        }
        .build()
        return _planeLanding!!
    }

private var _planeLanding: ImageVector? = null
