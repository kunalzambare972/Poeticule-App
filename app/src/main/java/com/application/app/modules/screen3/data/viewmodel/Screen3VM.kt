package com.application.app.modules.screen3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.screen3.`data`.model.Screen17RowModel
import com.application.app.modules.screen3.`data`.model.Screen3Model
import kotlin.collections.MutableList

public class Screen3VM : ViewModel() {
  public val screen3Model: MutableLiveData<Screen3Model> = MutableLiveData(Screen3Model())

  public val recyclerGroupppList: MutableLiveData<MutableList<Screen17RowModel>> =
      MutableLiveData(mutableListOf())
}
