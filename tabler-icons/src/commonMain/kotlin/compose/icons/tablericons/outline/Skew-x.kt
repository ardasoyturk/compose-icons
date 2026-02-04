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

public val OutlineGroup.`Skew-x`: ImageVector
    get() {
        if (`_skew-x` != null) {
            return `_skew-x`!!
        }
        `_skew-x` = Builder(name = "Skew-x", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.205f)
                verticalLineToRelative(13.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.184f, 0.983f)
                lineToRelative(14.0f, -2.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.816f, -0.983f)
                verticalLineToRelative(-8.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.816f, -0.983f)
                lineToRelative(-14.0f, -2.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.184f, 0.983f)
            }
        }
        .build()
        return `_skew-x`!!
    }

private var `_skew-x`: ImageVector? = null
