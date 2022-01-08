package com.application.app.modules.screen15.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen15Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen10.ui.Screen10Activity
import com.application.app.modules.screen11.ui.Screen11Activity
import com.application.app.modules.screen15.`data`.viewmodel.Screen15VM
import com.application.app.modules.screen6.ui.Screen6Activity
import com.application.app.modules.screen8.ui.Screen8Activity
import com.application.app.modules.screen9.ui.Screen9Activity
import kotlin.String
import kotlin.Unit

public class Screen15Activity : BaseActivity<ActivityScreen15Binding>(R.layout.activity_screen_15) {
  private val viewModel: Screen15VM by viewModels<Screen15VM>()

  public override fun onInitialized(): Unit {
    binding.screen15VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtMAGICSPELLOF.setOnClickListener  {

        val destIntent = Screen9Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageRectanglefirst.setOnClickListener  {

        val destIntent = Screen6Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.txtSTAINEDWINDOW.setOnClickListener  {

        val destIntent = Screen6Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageRectanglefirst1.setOnClickListener  {

        val destIntent = Screen9Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageRectanglefirsrt.setOnClickListener  {

        val destIntent = Screen11Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.txtPrice.setOnClickListener  {

        val destIntent = Screen10Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.imageRectanglefist.setOnClickListener  {

        val destIntent = Screen10Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.txtTINYLITTLEMOM.setOnClickListener  {

        val destIntent = Screen11Activity.getIntent(this, null)
        startActivity(destIntent)

    }
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
    public const val TAG: String = "SCREEN15ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Screen15Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
