package com.application.app.modules.screen13.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen13Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen13.`data`.viewmodel.Screen13VM
import com.application.app.modules.screen14.ui.Screen14Activity
import kotlin.String
import kotlin.Unit

public class Screen13Activity : BaseActivity<ActivityScreen13Binding>(R.layout.activity_screen_13) {
  private val viewModel: Screen13VM by viewModels<Screen13VM>()

  public override fun onInitialized(): Unit {
    binding.screen13VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtBySakshiSakha.setOnClickListener      {

                                val destIntent = Screen14Activity.getIntent(this, null)
                                startActivity(destIntent)

                            }
      binding.imageHOMEICON.setOnClickListener      {

                                        val destIntent = Screen1Activity.getIntent(this, null)
                                        startActivity(destIntent)

                                    }
        binding.imageTextx.setOnClickListener      {

                                                val destIntent = Screen1Activity.getIntent(this,
              null)
                                                startActivity(destIntent)

                                            }
        }

        public companion object {
          public const val TAG: String = "SCREEN13ACTIVITY"

          public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, Screen13Activity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
