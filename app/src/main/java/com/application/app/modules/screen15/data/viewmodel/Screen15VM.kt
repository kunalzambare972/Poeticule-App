package com.application.app.modules.screen15.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen15.`data`.model.Screen15Model

public class Screen15VM : ViewModel() {
  public val screen15Model: MutableLiveData<Screen15Model> = MutableLiveData(Screen15Model())
}
