package com.application.app.modules.screen10.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen10.`data`.model.Screen10Model

public class Screen10VM : ViewModel() {
  public val screen10Model: MutableLiveData<Screen10Model> = MutableLiveData(Screen10Model())
}
