package com.application.app.modules.screen5.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen5.`data`.model.Screen5Model

public class Screen5VM : ViewModel() {
  public val screen5Model: MutableLiveData<Screen5Model> = MutableLiveData(Screen5Model())
}
