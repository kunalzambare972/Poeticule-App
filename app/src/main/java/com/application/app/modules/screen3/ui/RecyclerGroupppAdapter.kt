package com.application.app.modules.screen3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowScreen17Binding
import com.application.app.modules.screen3.`data`.model.Screen17RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroupppAdapter(
  public var list: List<Screen17RowModel>
) : RecyclerView.Adapter<RecyclerGroupppAdapter.RowScreen17VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowScreen17VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_screen_17,parent,false)
    return RowScreen17VH(view)
  }

  public override fun onBindViewHolder(holder: RowScreen17VH, position: Int): Unit {
    val screen17RowModel = Screen17RowModel()
    // TODO uncomment following line after integration with data source
    // val screen17RowModel = list[position]
    holder.binding.screen17RowModel = screen17RowModel
  }

  public override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Screen17RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Screen17RowModel
    ): Unit {
    }
  }

  public inner class RowScreen17VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowScreen17Binding = RowScreen17Binding.bind(itemView)
  }
}
