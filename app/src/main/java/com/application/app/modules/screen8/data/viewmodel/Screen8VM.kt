package com.application.app.modules.screen8.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen8.`data`.model.Screen8Model

public class Screen8VM : ViewModel() {
  public val screen8Model: MutableLiveData<Screen8Model> = MutableLiveData(Screen8Model())
}
