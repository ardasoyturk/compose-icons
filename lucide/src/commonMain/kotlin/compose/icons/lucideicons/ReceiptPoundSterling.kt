package compose.icons.lucideicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LucideIcons
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val LucideIcons.ReceiptPoundSterling: ImageVector
    get() {
        if (_receiptPoundSterling != null) {
            return _receiptPoundSterling!!
        }
        _receiptPoundSterling = Builder(name = "ReceiptPoundSterling", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineTo(2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-2.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 17.0f)
                verticalLineTo(9.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(7.0f)
            }
        }
        .build()
        return _receiptPoundSterling!!
    }

private var _receiptPoundSterling: ImageVector? = null
