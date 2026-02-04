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

public val LucideIcons.ReceiptCent: ImageVector
    get() {
        if (_receiptCent != null) {
            return _receiptCent!!
        }
        _receiptCent = Builder(name = "ReceiptCent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 6.5f)
                verticalLineToRelative(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 5.2f)
            }
        }
        .build()
        return _receiptCent!!
    }

private var _receiptCent: ImageVector? = null
