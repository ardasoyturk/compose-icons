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

public val OutlineGroup.`Brand-printables`: ImageVector
    get() {
        if (`_brand-printables` != null) {
            return `_brand-printables`!!
        }
        `_brand-printables` = Builder(name = "Brand-printables", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 21.0f)
                lineToRelative(12.0f, -7.0f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-6.0f, -3.5f)
                lineToRelative(-6.0f, 3.5f)
                lineToRelative(6.0f, 3.5f)
                verticalLineToRelative(7.5f)
                lineToRelative(-6.0f, -3.5f)
                lineToRelative(0.0f, 7.0f)
            }
        }
        .build()
        return `_brand-printables`!!
    }

private var `_brand-printables`: ImageVector? = null
