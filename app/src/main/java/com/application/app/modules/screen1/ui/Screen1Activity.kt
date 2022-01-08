package com.application.app.modules.screen1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen1Binding
import com.application.app.modules.screen1.`data`.viewmodel.Screen1VM
import com.application.app.modules.screen12.ui.Screen12Activity
import com.application.app.modules.screen13.ui.Screen13Activity
import com.application.app.modules.screen6.ui.Screen6Activity
import com.application.app.modules.screen8.ui.Screen8Activity
import com.application.app.modules.screen9.ui.Screen9Activity
import kotlin.String
import kotlin.Unit

public class Screen1Activity : BaseActivity<ActivityScreen1Binding>(R.layout.activity_screen_1) {
  private val viewModel: Screen1VM by viewModels<Screen1VM>()

  public override fun onInitialized(): Unit {
    binding.screen1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageNOTIFICATIONIC.setOnClickListener           {

                                                              val destIntent =
                Screen8Activity.getIntent(this,
                      null)
                                                              startActivity(destIntent)

                                                          }
      binding.constraintGroup216.setOnClickListener           {

                                                                                val destIntent =
                                    Screen12Activity.getIntent(this,
                                            null)
                                                                               
            startActivity(destIntent)

                                                                            }
        binding.constraintGroup219.setOnClickListener           {

                                                                                                 
              val
                        destIntent =
                                                      Screen13Activity.getIntent(this,
                                                                null)
                                                                                                 
                                  startActivity(destIntent)

                                                                                              }
          binding.constraintGroup205.setOnClickListener           {

                                                                                                    
                           
                               val
                                        destIntent =
                                                                           
                Screen6Activity.getIntent(this,
                            null)
                                                                                                    
                           
                              
                                                    startActivity(destIntent)

                                                                                                    
                          
                            }
            binding.constraintGroup208.setOnClickListener           {

                                                                                                    
                               
                                             
                                                   val
                                                            destIntent =
                                                                                       
                                Screen9Activity.getIntent(this,
                                                                                                    
                   null)
                                                                                                    
                               
                                             
                                                  
                                                                          startActivity(destIntent)

                                                                                                    
                               
                                             
                                               }
            }

            public companion object {
              public const val TAG: String = "SCREEN1ACTIVITY"

              public fun getIntent(context: Context, bundle: Bundle?): Intent {
                val destIntent = Intent(context, Screen1Activity::class.java)
                destIntent.putExtra("bundle", bundle)
                return destIntent
              }
            }
          }
