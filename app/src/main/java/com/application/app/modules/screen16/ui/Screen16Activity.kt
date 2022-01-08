package com.application.app.modules.screen16.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen16Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen12.ui.Screen12Activity
import com.application.app.modules.screen16.`data`.viewmodel.Screen16VM
import com.application.app.modules.screen8.ui.Screen8Activity
import kotlin.String
import kotlin.Unit

public class Screen16Activity : BaseActivity<ActivityScreen16Binding>(R.layout.activity_screen_16) {
  private val viewModel: Screen16VM by viewModels<Screen16VM>()

  public override fun onInitialized(): Unit {
    binding.screen16VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtUGLYLOVE.setOnClickListener   {

              val destIntent = Screen12Activity.getIntent(this, null)
              startActivity(destIntent)

          }
      binding.imageNOTIFICATIONIC.setOnClickListener   {

                val destIntent = Screen8Activity.getIntent(this, null)
                startActivity(destIntent)

            }
        binding.imageRectfirst.setOnClickListener   {

                  val destIntent = Screen12Activity.getIntent(this, null)
                  startActivity(destIntent)

              }
          binding.imageHOMEICON.setOnClickListener   {

                    val destIntent = Screen1Activity.getIntent(this, null)
                    startActivity(destIntent)

                }
          }

          private fun toggleDrawer(): Unit {
            if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START))    {
                                      binding.drawerLayout.openDrawer(GravityCompat.START)
                                  }
              else    {
                                            binding.drawerLayout.closeDrawer(GravityCompat.START)
                                        }
              }

              public companion object {
                public const val TAG: String = "SCREEN16ACTIVITY"

                public fun getIntent(context: Context, bundle: Bundle?): Intent {
                  val destIntent = Intent(context, Screen16Activity::class.java)
                  destIntent.putExtra("bundle", bundle)
                  return destIntent
                }
              }
            }
