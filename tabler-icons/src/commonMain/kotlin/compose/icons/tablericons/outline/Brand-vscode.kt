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

public val OutlineGroup.`Brand-vscode`: ImageVector
    get() {
        if (`_brand-vscode` != null) {
            return `_brand-vscode`!!
        }
        `_brand-vscode` = Builder(name = "Brand-vscode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(4.0f, -2.5f)
                verticalLineToRelative(-13.0f)
                lineToRelative(-4.0f, -2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.165f, 13.903f)
                lineToRelative(-4.165f, 3.597f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(4.333f, -4.5f)
                moveToRelative(1.735f, -1.802f)
                lineToRelative(6.932f, -7.198f)
                verticalLineToRelative(5.0f)
                lineToRelative(-4.795f, 4.141f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.5f)
                lineToRelative(-11.0f, -10.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(13.0f, 13.5f)
            }
        }
        .build()
        return `_brand-vscode`!!
    }

private var `_brand-vscode`: ImageVector? = null
