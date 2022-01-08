package com.application.app.modules.screen12.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen12Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen12.`data`.viewmodel.Screen12VM
import com.application.app.modules.screen16.ui.Screen16Activity
import kotlin.String
import kotlin.Unit

public class Screen12Activity : BaseActivity<ActivityScreen12Binding>(R.layout.activity_screen_12) {
  private val viewModel: Screen12VM by viewModels<Screen12VM>()

  public override fun onInitialized(): Unit {
    binding.screen12VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtByCollenHover.setOnClickListener  {

        val destIntent = Screen16Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageTextxsecond.setOnClickListener  {

        val destIntent = Screen1Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageHOMEICON.setOnClickListener  {

        val destIntent = Screen1Activity.getIntent(this, null)
        startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "SCREEN12ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Screen12Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
