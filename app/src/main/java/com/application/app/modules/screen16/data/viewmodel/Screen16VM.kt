package com.application.app.modules.screen16.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.itemscreen7.`data`.model.DrawerItemScreen7Model
import com.application.app.modules.screen16.`data`.model.Screen16Model

public class Screen16VM : ViewModel() {
  public val screen16Model: MutableLiveData<Screen16Model> = MutableLiveData(Screen16Model())

  public var includedModel: MutableLiveData<DrawerItemScreen7Model> =
      MutableLiveData(DrawerItemScreen7Model())
}
