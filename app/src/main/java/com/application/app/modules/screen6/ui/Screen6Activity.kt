package com.application.app.modules.screen6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen6Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen5.ui.Screen5Activity
import com.application.app.modules.screen6.`data`.viewmodel.Screen6VM
import kotlin.String
import kotlin.Unit

public class Screen6Activity : BaseActivity<ActivityScreen6Binding>(R.layout.activity_screen_6) {
  private val viewModel: Screen6VM by viewModels<Screen6VM>()

  public override fun onInitialized(): Unit {
    binding.screen6VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageTetxx.setOnClickListener     {

                          val destIntent = Screen1Activity.getIntent(this, null)
                          startActivity(destIntent)

                      }
      binding.txtByNupurShinde.setOnClickListener     {

                                val destIntent = Screen5Activity.getIntent(this, null)
                                startActivity(destIntent)

                            }
      }

      public companion object {
        public const val TAG: String = "SCREEN6ACTIVITY"

        public fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, Screen6Activity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
