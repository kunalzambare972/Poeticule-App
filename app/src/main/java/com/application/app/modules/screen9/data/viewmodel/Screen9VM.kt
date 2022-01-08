package com.application.app.modules.screen9.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen9.`data`.model.Screen9Model

public class Screen9VM : ViewModel() {
  public val screen9Model: MutableLiveData<Screen9Model> = MutableLiveData(Screen9Model())
}
