package com.application.app.modules.screen9.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen9Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMagicSpellof: String? =
      MyApp.getInstance().resources.getString(R.string.msg_magic_spell_of2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtByNupurShinde: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_by_nupur_shinde)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_under_moonlight)

)
