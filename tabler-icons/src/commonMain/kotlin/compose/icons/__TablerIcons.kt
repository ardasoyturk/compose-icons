package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.tablericons.AllIcons
import compose.icons.tablericons.AllIconsNamed
import compose.icons.tablericons.Filled
import compose.icons.tablericons.Outline
import compose.icons.tablericons.groupName
import kotlin.String
import kotlin.collections.List as ____KtList
import kotlin.collections.Map as ____KtMap

public object TablerIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val TablerIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Filled.AllIcons + Outline.AllIcons + listOf()
    return __AllIcons!!
  }

private var __AllIconsNamed: ____KtMap<String, ImageVector>? = null

public val TablerIcons.AllIconsNamed: ____KtMap<String, ImageVector>
  get() {
    if (__AllIconsNamed != null) {
      return __AllIconsNamed!!
    }
    __AllIconsNamed= Filled.AllIconsNamed.mapKeys { "${Filled.groupName}.${it.key}"} +
        Outline.AllIconsNamed.mapKeys { "${Outline.groupName}.${it.key}"} + mapOf()
    return __AllIconsNamed!!
  }
