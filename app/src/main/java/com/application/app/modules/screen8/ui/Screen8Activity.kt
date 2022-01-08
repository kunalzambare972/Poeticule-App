package com.application.app.modules.screen8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen8Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen8.`data`.viewmodel.Screen8VM
import kotlin.String
import kotlin.Unit

public class Screen8Activity : BaseActivity<ActivityScreen8Binding>(R.layout.activity_screen_8) {
  private val viewModel: Screen8VM by viewModels<Screen8VM>()

  public override fun onInitialized(): Unit {
    binding.screen8VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageHOMEICON.setOnClickListener      {

                                val destIntent = Screen1Activity.getIntent(this, null)
                                startActivity(destIntent)

                            }
    }

    public companion object {
      public const val TAG: String = "SCREEN8ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Screen8Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
