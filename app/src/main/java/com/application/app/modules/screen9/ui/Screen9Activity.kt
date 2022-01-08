package com.application.app.modules.screen9.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen9Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen15.ui.Screen15Activity
import com.application.app.modules.screen9.`data`.viewmodel.Screen9VM
import kotlin.String
import kotlin.Unit

public class Screen9Activity : BaseActivity<ActivityScreen9Binding>(R.layout.activity_screen_9) {
  private val viewModel: Screen9VM by viewModels<Screen9VM>()

  public override fun onInitialized(): Unit {
    binding.screen9VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtByNupurShinde.setOnClickListener      {

                                val destIntent = Screen15Activity.getIntent(this, null)
                                startActivity(destIntent)

                            }
      binding.imageTexttt.setOnClickListener      {

                                        val destIntent = Screen1Activity.getIntent(this, null)
                                        startActivity(destIntent)

                                    }
        binding.imageHOMEICON.setOnClickListener      {

                                                val destIntent = Screen1Activity.getIntent(this,
              null)
                                                startActivity(destIntent)

                                            }
        }

        public companion object {
          public const val TAG: String = "SCREEN9ACTIVITY"

          public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, Screen9Activity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
