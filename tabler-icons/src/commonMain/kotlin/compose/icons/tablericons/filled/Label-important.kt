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

public val FilledGroup.`Label-important`: ImageVector
    get() {
        if (`_label-important` != null) {
            return `_label-important`!!
        }
        `_label-important` = Builder(name = "Label-important", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.52f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.561f, 0.75f)
                lineToRelative(3.7f, 4.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.25f)
                lineToRelative(-3.7f, 4.624f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.561f, 0.751f)
                horizontalLineToRelative(-12.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.78f, -1.625f)
                lineToRelative(3.5f, -4.375f)
                lineToRelative(-3.5f, -4.375f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.668f, -1.62f)
                lineToRelative(0.112f, -0.005f)
                close()
            }
        }
        .build()
        return `_label-important`!!
    }

private var `_label-important`: ImageVector? = null
