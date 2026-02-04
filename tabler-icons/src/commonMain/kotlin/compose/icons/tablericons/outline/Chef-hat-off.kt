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

public val OutlineGroup.`Chef-hat-off`: ImageVector
    get() {
        if (`_chef-hat-off` != null) {
            return `_chef-hat-off`!!
        }
        `_chef-hat-off` = Builder(name = "Chef-hat-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.72f, 4.712f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.19f, 1.439f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.09f, 7.723f)
                verticalLineToRelative(0.126f)
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-7.126f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.081f, -7.796f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.161f, 17.009f)
                lineToRelative(10.839f, -0.009f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return `_chef-hat-off`!!
    }

private var `_chef-hat-off`: ImageVector? = null
