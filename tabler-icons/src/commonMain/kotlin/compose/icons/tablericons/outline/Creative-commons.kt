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

public val OutlineGroup.`Creative-commons`: ImageVector
    get() {
        if (`_creative-commons` != null) {
            return `_creative-commons`!!
        }
        `_creative-commons` = Builder(name = "Creative-commons", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -18.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 10.5f)
                curveToRelative(-0.847f, -0.71f, -2.132f, -0.658f, -2.914f, 0.116f)
                arcToRelative(1.928f, 1.928f, 0.0f, false, false, 0.0f, 2.768f)
                curveToRelative(0.782f, 0.774f, 2.067f, 0.825f, 2.914f, 0.116f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 10.5f)
                curveToRelative(-0.847f, -0.71f, -2.132f, -0.658f, -2.914f, 0.116f)
                arcToRelative(1.928f, 1.928f, 0.0f, false, false, 0.0f, 2.768f)
                curveToRelative(0.782f, 0.774f, 2.067f, 0.825f, 2.914f, 0.116f)
            }
        }
        .build()
        return `_creative-commons`!!
    }

private var `_creative-commons`: ImageVector? = null
