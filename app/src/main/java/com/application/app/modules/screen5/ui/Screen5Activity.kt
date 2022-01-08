package com.application.app.modules.screen5.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen5Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen5.`data`.viewmodel.Screen5VM
import com.application.app.modules.screen8.ui.Screen8Activity
import kotlin.String
import kotlin.Unit

public class Screen5Activity : BaseActivity<ActivityScreen5Binding>(R.layout.activity_screen_5) {
  private val viewModel: Screen5VM by viewModels<Screen5VM>()

  public override fun onInitialized(): Unit {
    binding.screen5VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageHOMEICON.setOnClickListener  {

        val destIntent = Screen1Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageNOTIFICATIONIC.setOnClickListener  {

        val destIntent = Screen8Activity.getIntent(this, null)
        startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "SCREEN5ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Screen5Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
