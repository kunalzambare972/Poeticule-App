package com.application.app.modules.screen3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen17RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFOLLOW: String? = MyApp.getInstance().resources.getString(R.string.lbl_follow)

)
