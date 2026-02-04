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

public val OutlineGroup.`Brand-google-play`: ImageVector
    get() {
        if (`_brand-google-play` != null) {
            return `_brand-google-play`!!
        }
        `_brand-google-play` = Builder(name = "Brand-google-play", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.71f)
                verticalLineToRelative(16.58f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 1.05f, 0.606f)
                lineToRelative(14.622f, -8.42f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.0f, -0.953f)
                lineToRelative(-14.622f, -8.419f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -1.05f, 0.607f)
                lineToRelative(0.0f, -0.001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                lineToRelative(-10.5f, 11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.5f)
                lineToRelative(10.5f, 11.5f)
            }
        }
        .build()
        return `_brand-google-play`!!
    }

private var `_brand-google-play`: ImageVector? = null
