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

public val OutlineGroup.`Folder-open`: ImageVector
    get() {
        if (`_folder-open` != null) {
            return `_folder-open`!!
        }
        `_folder-open` = Builder(name = "Folder-open", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                lineToRelative(2.757f, -7.351f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.936f, -0.649f)
                horizontalLineToRelative(12.307f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.986f, 1.164f)
                lineToRelative(-0.996f, 5.211f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.964f, 1.625f)
                horizontalLineToRelative(-14.026f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
            }
        }
        .build()
        return `_folder-open`!!
    }

private var `_folder-open`: ImageVector? = null
