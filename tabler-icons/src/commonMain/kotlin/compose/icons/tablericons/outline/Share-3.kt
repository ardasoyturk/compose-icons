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

public val OutlineGroup.`Share-3`: ImageVector
    get() {
        if (`_share-3` != null) {
            return `_share-3`!!
        }
        `_share-3` = Builder(name = "Share-3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-6.575f, 1.028f, -9.02f, 6.788f, -10.0f, 12.0f)
                curveToRelative(-0.037f, 0.206f, 5.384f, -5.962f, 10.0f, -6.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(8.0f, -7.0f)
                lineToRelative(-8.0f, -7.0f)
            }
        }
        .build()
        return `_share-3`!!
    }

private var `_share-3`: ImageVector? = null
