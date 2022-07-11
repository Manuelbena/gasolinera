package com.example.gasolinera.ui.province.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.databinding.ItemProvinceBinding


class ProvinceAdapter(
   private val onClickListener : (ProvinceModel) ->Unit
): ListAdapter<ProvinceModel, ProvinceViewHolder>(DIFF_CALLBACK){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ProvinceViewHolder (
        ItemProvinceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ProvinceViewHolder, position: Int) = holder.bind(getItem(position), onClickListener)

    companion object { // Aqui cambio la lista en el caso de que me lo cambien
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ProvinceModel>() {
            override fun areItemsTheSame(oldItem: ProvinceModel, newItem: ProvinceModel): Boolean = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: ProvinceModel, newItem: ProvinceModel): Boolean = oldItem == newItem
        }
    }




}