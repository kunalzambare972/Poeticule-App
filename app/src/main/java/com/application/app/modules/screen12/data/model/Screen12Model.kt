package com.application.app.modules.screen12.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen12Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtUglyLove: String? = MyApp.getInstance().resources.getString(R.string.lbl_ugly_love2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtByCollenHover: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_by_collen_hover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_look_up_and)

)
