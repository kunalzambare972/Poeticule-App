package com.application.app.modules.screen6.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen6.`data`.model.Screen6Model

public class Screen6VM : ViewModel() {
  public val screen6Model: MutableLiveData<Screen6Model> = MutableLiveData(Screen6Model())
}
