package com.application.app.modules.screen2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen2.`data`.model.Screen2Model

public class Screen2VM : ViewModel() {
  public val screen2Model: MutableLiveData<Screen2Model> = MutableLiveData(Screen2Model())
}
