package com.application.app.modules.screen10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen10Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen10.`data`.viewmodel.Screen10VM
import com.application.app.modules.screen15.ui.Screen15Activity
import kotlin.String
import kotlin.Unit

public class Screen10Activity : BaseActivity<ActivityScreen10Binding>(R.layout.activity_screen_10) {
  private val viewModel: Screen10VM by viewModels<Screen10VM>()

  public override fun onInitialized(): Unit {
    binding.screen10VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageTetxxxx.setOnClickListener    {

                    val destIntent = Screen1Activity.getIntent(this, null)
                    startActivity(destIntent)

                }
      binding.txtByNupurShinde.setOnClickListener    {

                        val destIntent = Screen15Activity.getIntent(this, null)
                        startActivity(destIntent)

                    }
        binding.imageHOMEICON.setOnClickListener    {

                            val destIntent = Screen1Activity.getIntent(this, null)
                            startActivity(destIntent)

                        }
        }

        public companion object {
          public const val TAG: String = "SCREEN10ACTIVITY"

          public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, Screen10Activity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
