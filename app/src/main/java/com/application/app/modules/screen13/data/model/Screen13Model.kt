package com.application.app.modules.screen13.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen13Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWaves: String? = MyApp.getInstance().resources.getString(R.string.lbl_waves2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBySakshiSakha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_sakshi_sakha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_imagine_all_the)

)
