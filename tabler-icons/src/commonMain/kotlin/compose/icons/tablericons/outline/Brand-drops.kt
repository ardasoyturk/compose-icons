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

public val OutlineGroup.`Brand-drops`: ImageVector
    get() {
        if (`_brand-drops` != null) {
            return `_brand-drops`!!
        }
        `_brand-drops` = Builder(name = "Brand-drops", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.637f, 7.416f)
                arcToRelative(7.907f, 7.907f, 0.0f, false, true, 1.76f, 8.666f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.397f, 4.918f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.396f, -4.918f)
                arcToRelative(7.907f, 7.907f, 0.0f, false, true, 1.759f, -8.666f)
                lineToRelative(5.637f, -5.416f)
                lineToRelative(5.637f, 5.416f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.466f, 10.923f)
                arcToRelative(3.595f, 3.595f, 0.0f, false, true, 0.77f, 3.877f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.236f, 2.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.236f, -2.2f)
                arcToRelative(3.595f, 3.595f, 0.0f, false, true, 0.77f, -3.877f)
                lineToRelative(2.466f, -2.423f)
                lineToRelative(2.466f, 2.423f)
            }
        }
        .build()
        return `_brand-drops`!!
    }

private var `_brand-drops`: ImageVector? = null
