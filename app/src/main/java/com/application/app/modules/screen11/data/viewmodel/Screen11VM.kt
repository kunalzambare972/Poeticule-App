package com.application.app.modules.screen11.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen11.`data`.model.Screen11Model

public class Screen11VM : ViewModel() {
  public val screen11Model: MutableLiveData<Screen11Model> = MutableLiveData(Screen11Model())
}
