package compose.icons.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.tablericons.FilledGroup

public val FilledGroup.`Chart-pie-2`: ImageVector
    get() {
        if (`_chart-pie-2` != null) {
            return `_chart-pie-2`!!
        }
        `_chart-pie-2` = Builder(name = "Chart-pie-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.05f)
                verticalLineToRelative(9.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(9.95f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -19.95f, -1.0f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 8.995f, -9.626f)
                moveToRelative(6.0f, 1.29f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 4.95f, 7.66f)
                horizontalLineToRelative(-8.95f)
                verticalLineToRelative(-8.95f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 4.0f, 1.29f)
            }
        }
        .build()
        return `_chart-pie-2`!!
    }

private var `_chart-pie-2`: ImageVector? = null
