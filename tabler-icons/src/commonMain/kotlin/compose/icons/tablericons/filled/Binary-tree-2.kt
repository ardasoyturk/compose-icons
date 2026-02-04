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

public val FilledGroup.`Binary-tree-2`: ImageVector
    get() {
        if (`_binary-tree-2` != null) {
            return `_binary-tree-2`!!
        }
        `_binary-tree-2` = Builder(name = "Binary-tree-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.616f, 4.47f)
                lineToRelative(3.274f, 3.742f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.505f, 1.318f)
                lineToRelative(-3.275f, -3.743f)
                lineToRelative(-0.11f, 0.042f)
                verticalLineToRelative(6.342f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-6.342f)
                lineToRelative(-0.111f, -0.041f)
                lineToRelative(-3.274f, 3.742f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.505f, -1.318f)
                lineToRelative(3.273f, -3.742f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.617f, -4.47f)
            }
        }
        .build()
        return `_binary-tree-2`!!
    }

private var `_binary-tree-2`: ImageVector? = null
