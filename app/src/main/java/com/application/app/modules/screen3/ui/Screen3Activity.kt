package com.application.app.modules.screen3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityScreen3Binding
import com.application.app.modules.screen1.ui.Screen1Activity
import com.application.app.modules.screen3.`data`.model.Screen17RowModel
import com.application.app.modules.screen3.`data`.viewmodel.Screen3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Screen3Activity : BaseActivity<ActivityScreen3Binding>(R.layout.activity_screen_3) {
  private val viewModel: Screen3VM by viewModels<Screen3VM>()

  public override fun onInitialized(): Unit {
    val recyclerGroupppAdapter =
                           
        RecyclerGroupppAdapter(viewModel.recyclerGroupppList.value?:mutableListOf())
    binding.recyclerGrouppp.adapter = recyclerGroupppAdapter
    recyclerGroupppAdapter.setOnItemClickListener(
    object : RecyclerGroupppAdapter.OnItemClickListener    {
      override fun onItemClick(view:View, position:Int, item : Screen17RowModel)    {
                                        onClickRecyclerGrouppp(view, position, item)
                                    }
                                }
                                )
        viewModel.recyclerGroupppList.observe(this)    {
                                          recyclerGroupppAdapter.updateData(it)
                                      }
          binding.screen3VM = viewModel
        }

        public override fun setUpClicks(): Unit {
          binding.imageHOMEICON.setOnClickListener  {

              val destIntent = Screen1Activity.getIntent(this, null)
              startActivity(destIntent)

          }
        }

        public fun onClickRecyclerGrouppp(
          view: View,
          position: Int,
          item: Screen17RowModel
        ): Unit {
          when(view.id)  {


          }
        }

        public companion object {
          public const val TAG: String = "SCREEN3ACTIVITY"

          public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, Screen3Activity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
