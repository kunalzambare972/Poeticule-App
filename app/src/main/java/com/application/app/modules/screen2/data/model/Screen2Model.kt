package com.application.app.modules.screen2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNETWORK: String? = MyApp.getInstance().resources.getString(R.string.lbl_network)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtINTEREST: String? = MyApp.getInstance().resources.getString(R.string.lbl_interest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtABOUTUS: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)

)
