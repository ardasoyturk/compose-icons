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

public val OutlineGroup.`Brand-yatse`: ImageVector
    get() {
        if (`_brand-yatse` != null) {
            return `_brand-yatse`!!
        }
        `_brand-yatse` = Builder(name = "Brand-yatse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                lineToRelative(5.0f, 2.876f)
                verticalLineToRelative(5.088f)
                lineToRelative(4.197f, -2.73f)
                lineToRelative(4.803f, 2.731f)
                lineToRelative(-9.281f, 5.478f)
                lineToRelative(-2.383f, 1.41f)
                lineToRelative(-2.334f, 1.377f)
                lineToRelative(-3.0f, 1.77f)
                verticalLineToRelative(-5.565f)
                lineToRelative(3.0f, -1.771f)
                lineToRelative(-0.002f, -10.664f)
            }
        }
        .build()
        return `_brand-yatse`!!
    }

private var `_brand-yatse`: ImageVector? = null
