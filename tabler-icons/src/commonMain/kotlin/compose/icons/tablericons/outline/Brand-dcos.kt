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

public val OutlineGroup.`Brand-dcos`: ImageVector
    get() {
        if (`_brand-dcos` != null) {
            return `_brand-dcos`!!
        }
        `_brand-dcos` = Builder(name = "Brand-dcos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                lineToRelative(18.0f, -12.0f)
                horizontalLineToRelative(-18.0f)
                lineToRelative(9.0f, 14.0f)
                lineToRelative(9.0f, -14.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(-18.0f, -10.0f)
                lineToRelative(0.0f, 12.0f)
            }
        }
        .build()
        return `_brand-dcos`!!
    }

private var `_brand-dcos`: ImageVector? = null
