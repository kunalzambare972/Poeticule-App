package com.application.app.modules.screen11.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen11Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTinyLittleMom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tiny_little_mom2)
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
      MyApp.getInstance().resources.getString(R.string.msg_you_are_alive_b)

)
