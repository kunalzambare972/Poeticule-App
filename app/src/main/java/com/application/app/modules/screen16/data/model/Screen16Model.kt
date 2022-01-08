package com.application.app.modules.screen16.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen16Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOETICULE: String? = MyApp.getInstance().resources.getString(R.string.lbl_poeticule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCollenHoverHo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_collen_hover_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtK: String? = MyApp.getInstance().resources.getString(R.string.lbl_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOSTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUGLYLOVE: String? = MyApp.getInstance().resources.getString(R.string.lbl_ugly_love)

)
