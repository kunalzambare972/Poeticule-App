package com.application.app.modules.screen11.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen11Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen11.`data`.viewmodel.Screen11VM
import com.application.app.modules.screen15.ui.Screen15Activity
import kotlin.String
import kotlin.Unit

public class Screen11Activity : BaseActivity<ActivityScreen11Binding>(R.layout.activity_screen_11) {
  private val viewModel: Screen11VM by viewModels<Screen11VM>()

  public override fun onInitialized(): Unit {
    binding.screen11VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageTextxx.setOnClickListener     {

                          val destIntent = Screen1Activity.getIntent(this, null)
                          startActivity(destIntent)

                      }
      binding.txtByNupurShinde.setOnClickListener     {

                                val destIntent = Screen15Activity.getIntent(this, null)
                                startActivity(destIntent)

                            }
        binding.imageHOMEICON.setOnClickListener     {

                                      val destIntent = Screen1Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                  }
        }

        public companion object {
          public const val TAG: String = "SCREEN11ACTIVITY"

          public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, Screen11Activity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
