package com.application.app.modules.screen6.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen6Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtStainedWindow: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stained_window2)
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
      MyApp.getInstance().resources.getString(R.string.msg_stained_window)

)
