package com.fauzan.covid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fauzan.covid.R
import com.fauzan.covid.model.Hospital
import kotlinx.android.synthetic.main.row_hospital.view.*

class HospitalAdapter(private val hospitalList: ArrayList<Hospital>): RecyclerView.Adapter<HospitalAdapter.HospitalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_hospital, parent, false)
        return HospitalViewHolder(view)
    }

    override fun getItemCount(): Int = hospitalList.size

    override fun onBindViewHolder(holder: HospitalViewHolder, position: Int) {
        holder.bind(hospitalList[position])
    }

    inner class HospitalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(model: Hospital) {
            with(itemView){
                tv_province.text = model.province
                tv_hospital.text = model.hospital
            }
        }
    }
}