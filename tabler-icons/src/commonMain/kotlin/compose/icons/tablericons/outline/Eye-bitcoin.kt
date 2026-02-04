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

public val OutlineGroup.`Eye-bitcoin`: ImageVector
    get() {
        if (`_eye-bitcoin` != null) {
            return `_eye-bitcoin`!!
        }
        `_eye-bitcoin` = Builder(name = "Eye-bitcoin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.193f, 17.924f)
                quadToRelative(-0.585f, 0.075f, -1.193f, 0.076f)
                quadToRelative(-5.4f, 0.0f, -9.0f, -6.0f)
                quadToRelative(3.6f, -6.0f, 9.0f, -6.0f)
                quadToRelative(4.508f, 0.0f, 7.761f, 4.181f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                moveToRelative(2.0f, 0.0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0.0f, 9.0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(-2.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                moveToRelative(-1.0f, 0.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(3.0f, -3.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-3.5f)
            }
        }
        .build()
        return `_eye-bitcoin`!!
    }

private var `_eye-bitcoin`: ImageVector? = null
