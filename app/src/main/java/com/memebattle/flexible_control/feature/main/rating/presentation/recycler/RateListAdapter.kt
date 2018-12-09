package com.memebattle.flexible_control.feature.main.task_list.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.memebattle.flexible_control.R
import com.memebattle.flexible_control.feature.main.rating.domain.model.RateModel


class RateListAdapter(var list : List<RateModel>): RecyclerView.Adapter<RateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RateViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_rate, parent, false)
        return RateViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }
    override fun onBindViewHolder(holder: RateViewHolder, position: Int) {
        val task = list[position]
        val itemview = holder.itemView
    }
}