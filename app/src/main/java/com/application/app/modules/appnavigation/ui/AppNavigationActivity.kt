package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen10.ui.Screen10Activity
import com.application.app.modules.screen11.ui.Screen11Activity
import com.application.app.modules.screen12.ui.Screen12Activity
import com.application.app.modules.screen13.ui.Screen13Activity
import com.application.app.modules.screen14.ui.Screen14Activity
import com.application.app.modules.screen15.ui.Screen15Activity
import com.application.app.modules.screen16.ui.Screen16Activity
import com.application.app.modules.screen2.ui.Screen2Activity
import com.application.app.modules.screen3.ui.Screen3Activity
import com.application.app.modules.screen4.ui.Screen4Activity
import com.application.app.modules.screen5.ui.Screen5Activity
import com.application.app.modules.screen6.ui.Screen6Activity
import com.application.app.modules.screen8.ui.Screen8Activity
import com.application.app.modules.screen9.ui.Screen9Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearSCREEN2.setOnClickListener  {

        val destIntent = Screen2Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN1.setOnClickListener  {

        val destIntent = Screen1Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN15.setOnClickListener  {

        val destIntent = Screen15Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN9.setOnClickListener  {

        val destIntent = Screen9Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN4.setOnClickListener  {

        val destIntent = Screen4Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN5.setOnClickListener  {

        val destIntent = Screen5Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN13.setOnClickListener  {

        val destIntent = Screen13Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN14.setOnClickListener  {

        val destIntent = Screen14Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN16.setOnClickListener  {

        val destIntent = Screen16Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN8.setOnClickListener  {

        val destIntent = Screen8Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN12.setOnClickListener  {

        val destIntent = Screen12Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN6.setOnClickListener  {

        val destIntent = Screen6Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN3.setOnClickListener  {

        val destIntent = Screen3Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN10.setOnClickListener  {

        val destIntent = Screen10Activity.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearSCREEN11.setOnClickListener  {

        val destIntent = Screen11Activity.getIntent(this, null)
        startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
