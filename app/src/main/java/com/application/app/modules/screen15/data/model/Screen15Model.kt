package com.application.app.modules.screen15.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Screen15Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOETICULE: String? = MyApp.getInstance().resources.getString(R.string.lbl_poeticule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIamnupurNupur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iamnupur_nupur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOSTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSTAINEDWINDOW: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stained_window)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMAGICSPELLOF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_magic_spell_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTINYLITTLEMOM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tiny_little_mom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? =
      MyApp.getInstance().resources.getString(R.string.msg_strong_as_feath)

)
