package com.application.app.modules.screen5.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen5Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOETICULE: String? = MyApp.getInstance().resources.getString(R.string.lbl_poeticule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsernameBIO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_username_bio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOSTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blog_poem_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blog_poem_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blog_poem_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice3: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blog_poem_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice4: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blog_poem_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice5: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blog_poem_title)

)
