package com.example.kotlin1homework4.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1homework4.databinding.RvItemBinding
class RvAdapter(private val operationList: MutableList<String>): RecyclerView.Adapter<RvAdapter.ViewHolder>() {


    inner class ViewHolder(private var binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(operation: String) {
            binding.operationsTv.text =operation
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(operationList[position])

    }

    override fun getItemCount()  = operationList.size
}