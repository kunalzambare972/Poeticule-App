package com.application.app.modules.screen1.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen1.`data`.model.Screen1Model

public class Screen1VM : ViewModel() {
  public val screen1Model: MutableLiveData<Screen1Model> = MutableLiveData(Screen1Model())
}
