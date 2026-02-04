package compose.icons.tablericons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.tablericons.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.`Copyright-off`: ImageVector
    get() {
        if (`_copyright-off` != null) {
            return `_copyright-off`!!
        }
        `_copyright-off` = Builder(name = "Copyright-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.75f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, -0.711f, -0.466f)
                moveToRelative(-3.41f, 0.596f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -0.042f, 4.197f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, 4.163f, 0.173f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.042f, 16.045f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.087f, -12.087f)
                moveToRelative(-2.318f, 1.677f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 12.725f, 12.73f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_copyright-off`!!
    }

private var `_copyright-off`: ImageVector? = null
