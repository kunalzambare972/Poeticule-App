package com.application.app.modules.screen10.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen10Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtStrongasFeath: String? =
      MyApp.getInstance().resources.getString(R.string.msg_strong_as_feath2)
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
      MyApp.getInstance().resources.getString(R.string.msg_she_was_as_stro)

)
