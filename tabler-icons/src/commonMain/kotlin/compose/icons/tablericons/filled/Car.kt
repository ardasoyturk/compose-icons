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

public val FilledGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.694f, 0.28f)
                lineToRelative(0.087f, 0.095f)
                lineToRelative(3.699f, 4.625f)
                horizontalLineToRelative(0.52f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.658f, 0.0f)
                horizontalLineToRelative(-4.342f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, -5.658f, 0.0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(0.008f, -0.056f)
                lineToRelative(0.017f, -0.078f)
                lineToRelative(0.012f, -0.036f)
                lineToRelative(0.014f, -0.05f)
                lineToRelative(2.014f, -5.034f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.928f, -0.629f)
                close()
                moveTo(7.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-6.0f, -9.0f)
                horizontalLineToRelative(-5.324f)
                lineToRelative(-1.2f, 3.0f)
                horizontalLineToRelative(6.524f)
                close()
                moveTo(13.52f, 7.0f)
                horizontalLineToRelative(-0.52f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.92f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
