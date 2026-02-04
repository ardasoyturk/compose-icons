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

public val LucideIcons.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) {
            return _heartCrack!!
        }
        _heartCrack = Builder(name = "HeartCrack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.409f, 5.824f)
                curveToRelative(-0.702f, 0.792f, -1.15f, 1.496f, -1.415f, 2.166f)
                lineToRelative(2.153f, 2.156f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.707f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                lineTo(12.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.508f, 20.313f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 0.019f)
                lineTo(5.0f, 15.0f)
                curveToRelative(-1.5f, -1.5f, -3.0f, -3.2f, -3.0f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 9.591f, -3.677f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.818f, 0.001f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 22.0f, 9.5f)
                curveToRelative(0.0f, 2.29f, -1.5f, 4.0f, -3.0f, 5.5f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
