package com.application.app.modules.screen14.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen14Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen13.ui.Screen13Activity
import com.application.app.modules.screen14.`data`.viewmodel.Screen14VM
import com.application.app.modules.screen8.ui.Screen8Activity
import kotlin.String
import kotlin.Unit

public class Screen14Activity : BaseActivity<ActivityScreen14Binding>(R.layout.activity_screen_14) {
  private val viewModel: Screen14VM by viewModels<Screen14VM>()

  public override fun onInitialized(): Unit {
    binding.screen14VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtPrice.setOnClickListener  {

        val destIntent = Screen13Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageNOTIFICATIONIC.setOnClickListener  {

        val destIntent = Screen8Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageRectangfirst.setOnClickListener  {

        val destIntent = Screen13Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageHOMEICON.setOnClickListener  {

        val destIntent = Screen1Activity.getIntent(this, null)
        startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "SCREEN14ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Screen14Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
