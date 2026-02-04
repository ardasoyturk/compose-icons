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

public val FilledGroup.`Circle-letter-v`: ImageVector
    get() {
        if (`_circle-letter-v` != null) {
            return `_circle-letter-v`!!
        }
        `_circle-letter-v` = Builder(name = "Circle-letter-v", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                moveToRelative(2.243f, 5.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.213f, 0.727f)
                lineToRelative(-1.03f, 4.118f)
                lineToRelative(-1.03f, -4.118f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.94f, 0.486f)
                lineToRelative(2.0f, 8.0f)
                curveToRelative(0.252f, 1.01f, 1.688f, 1.01f, 1.94f, 0.0f)
                lineToRelative(2.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.727f, -1.213f)
            }
        }
        .build()
        return `_circle-letter-v`!!
    }

private var `_circle-letter-v`: ImageVector? = null
