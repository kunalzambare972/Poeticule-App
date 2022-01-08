package com.application.app.modules.screen4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen4.`data`.model.Screen4Model

public class Screen4VM : ViewModel() {
  public val screen4Model: MutableLiveData<Screen4Model> = MutableLiveData(Screen4Model())
}
