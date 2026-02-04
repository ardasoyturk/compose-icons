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

public val OutlineGroup.`Currency-pound-off`: ImageVector
    get() {
        if (`_currency-pound-off` != null) {
            return `_currency-pound-off`!!
        }
        `_currency-pound-off` = Builder(name = "Currency-pound-off", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.5f)
                verticalLineToRelative(-7.5f)
                moveToRelative(1.192f, -2.825f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.258f, 0.825f)
                moveToRelative(-3.45f, 6.0f)
                horizontalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_currency-pound-off`!!
    }

private var `_currency-pound-off`: ImageVector? = null
