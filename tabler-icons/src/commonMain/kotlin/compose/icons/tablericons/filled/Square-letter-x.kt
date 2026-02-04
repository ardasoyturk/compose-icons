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

public val FilledGroup.`Square-letter-x`: ImageVector
    get() {
        if (`_square-letter-x` != null) {
            return `_square-letter-x`!!
        }
        `_square-letter-x` = Builder(name = "Square-letter-x", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(14.447f, 7.106f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.341f, 0.447f)
                lineToRelative(-1.106f, 2.21f)
                lineToRelative(-1.106f, -2.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.234f, -0.494f)
                lineToRelative(-0.107f, 0.047f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.447f, 1.341f)
                lineToRelative(1.774f, 3.553f)
                lineToRelative(-1.775f, 3.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, 1.283f)
                lineToRelative(0.102f, 0.058f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.341f, -0.447f)
                lineToRelative(1.107f, -2.211f)
                lineToRelative(1.106f, 2.211f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.234f, 0.494f)
                lineToRelative(0.107f, -0.047f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.447f, -1.341f)
                lineToRelative(-1.776f, -3.553f)
                lineToRelative(1.776f, -3.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.345f, -1.283f)
                close()
            }
        }
        .build()
        return `_square-letter-x`!!
    }

private var `_square-letter-x`: ImageVector? = null
