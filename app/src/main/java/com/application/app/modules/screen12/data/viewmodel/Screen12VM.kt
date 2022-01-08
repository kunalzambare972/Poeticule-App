package com.application.app.modules.screen12.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen12.`data`.model.Screen12Model

public class Screen12VM : ViewModel() {
  public val screen12Model: MutableLiveData<Screen12Model> = MutableLiveData(Screen12Model())
}
