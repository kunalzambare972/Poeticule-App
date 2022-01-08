package com.application.app.modules.screen14.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen14Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOETICULE: String? = MyApp.getInstance().resources.getString(R.string.lbl_poeticule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSmecyyyySakshi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_smecyyyy_sakshi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSakshisakhare: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sakshi_sakhare)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOSTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_waves)

)
