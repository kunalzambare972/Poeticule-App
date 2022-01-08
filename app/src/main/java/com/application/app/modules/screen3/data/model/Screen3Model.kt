package com.application.app.modules.screen3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSEARCH: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_all_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSUGGESTIONS: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_suggestions)

)
