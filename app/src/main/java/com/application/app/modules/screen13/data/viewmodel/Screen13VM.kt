package com.application.app.modules.screen13.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen13.`data`.model.Screen13Model

public class Screen13VM : ViewModel() {
  public val screen13Model: MutableLiveData<Screen13Model> = MutableLiveData(Screen13Model())
}
