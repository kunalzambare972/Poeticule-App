package com.application.app.modules.screen2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen2Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen2.`data`.viewmodel.Screen2VM
import com.application.app.modules.screen3.ui.Screen3Activity
import com.application.app.modules.screen4.ui.Screen4Activity
import kotlin.String
import kotlin.Unit

public class Screen2Activity : BaseActivity<ActivityScreen2Binding>(R.layout.activity_screen_2) {
  private val viewModel: Screen2VM by viewModels<Screen2VM>()

  public override fun onInitialized(): Unit {
    binding.screen2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.viewEllipse2.setOnClickListener  {

        val destIntent = Screen4Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.txtUsername.setOnClickListener  {

        val destIntent = Screen4Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.txtNETWORK.setOnClickListener  {

        val destIntent = Screen3Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageCiclosesmall.setOnClickListener  {

        val destIntent = Screen1Activity.getIntent(this, null)
        startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "SCREEN2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Screen2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
