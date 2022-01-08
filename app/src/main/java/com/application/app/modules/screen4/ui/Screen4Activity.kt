package com.application.app.modules.screen4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen4Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen4.`data`.viewmodel.Screen4VM
import com.application.app.modules.screen8.ui.Screen8Activity
import kotlin.String
import kotlin.Unit

public class Screen4Activity : BaseActivity<ActivityScreen4Binding>(R.layout.activity_screen_4) {
  private val viewModel: Screen4VM by viewModels<Screen4VM>()

  public override fun onInitialized(): Unit {
    binding.screen4VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageNOTIFICATIONIC.setOnClickListener  {

        val destIntent = Screen8Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageHOMEICON.setOnClickListener  {

        val destIntent = Screen1Activity.getIntent(this, null)
        startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "SCREEN4ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Screen4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
