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

public val OutlineGroup.`Brand-tabnine`: ImageVector
    get() {
        if (`_brand-tabnine` != null) {
            return `_brand-tabnine`!!
        }
        `_brand-tabnine` = Builder(name = "Brand-tabnine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                lineToRelative(-12.0f, 6.75f)
                moveToRelative(12.0f, -6.75f)
                lineToRelative(-12.0f, -6.75f)
                moveToRelative(12.0f, 6.75f)
                verticalLineToRelative(-4.527f)
                lineToRelative(-8.0f, -4.473f)
                lineToRelative(-4.0f, 2.25f)
                moveToRelative(12.0f, 6.75f)
                verticalLineToRelative(4.5f)
                lineToRelative(-8.0f, 4.5f)
                lineToRelative(-4.0f, -2.25f)
                moveToRelative(0.0f, -13.5f)
                lineToRelative(-4.0f, 2.222f)
                verticalLineToRelative(9.028f)
                lineToRelative(4.0f, 2.25f)
                lineToRelative(12.0f, -6.75f)
            }
        }
        .build()
        return `_brand-tabnine`!!
    }

private var `_brand-tabnine`: ImageVector? = null
