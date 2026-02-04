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

public val FilledGroup.`Capsule-horizontal`: ImageVector
    get() {
        if (`_capsule-horizontal` != null) {
            return `_capsule-horizontal`!!
        }
        `_capsule-horizontal` = Builder(name = "Capsule-horizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.0f, -7.0f)
                lineToRelative(-0.007f, -0.303f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -6.993f, -6.697f)
                close()
            }
        }
        .build()
        return `_capsule-horizontal`!!
    }

private var `_capsule-horizontal`: ImageVector? = null
