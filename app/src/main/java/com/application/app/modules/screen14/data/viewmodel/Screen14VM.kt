package com.application.app.modules.screen14.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen14.`data`.model.Screen14Model

public class Screen14VM : ViewModel() {
  public val screen14Model: MutableLiveData<Screen14Model> = MutableLiveData(Screen14Model())
}
