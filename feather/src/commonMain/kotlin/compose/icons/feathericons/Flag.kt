package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val FeatherIcons.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                reflectiveCurveToRelative(1.0f, -1.0f, 4.0f, -1.0f)
                reflectiveCurveToRelative(5.0f, 2.0f, 8.0f, 2.0f)
                reflectiveCurveToRelative(4.0f, -1.0f, 4.0f, -1.0f)
                verticalLineTo(3.0f)
                reflectiveCurveToRelative(-1.0f, 1.0f, -4.0f, 1.0f)
                reflectiveCurveToRelative(-5.0f, -2.0f, -8.0f, -2.0f)
                reflectiveCurveToRelative(-4.0f, 1.0f, -4.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                lineTo(4.0f, 15.0f)
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
