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

public val FilledGroup.`Square-letter-y`: ImageVector
    get() {
        if (`_square-letter-y` != null) {
            return `_square-letter-y`!!
        }
        `_square-letter-y` = Builder(name = "Square-letter-y", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(14.371f, 7.072f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.3f, 0.557f)
                lineToRelative(-1.071f, 2.678f)
                lineToRelative(-1.072f, -2.678f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.856f, 0.742f)
                lineToRelative(1.928f, 4.823f)
                verticalLineToRelative(2.806f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.809f)
                lineToRelative(1.928f, -4.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.45f, -1.25f)
                close()
            }
        }
        .build()
        return `_square-letter-y`!!
    }

private var `_square-letter-y`: ImageVector? = null
