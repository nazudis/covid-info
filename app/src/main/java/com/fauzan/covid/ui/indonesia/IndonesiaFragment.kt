package com.fauzan.covid.ui.indonesia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.fauzan.covid.R
import com.fauzan.covid.adapter.HospitalAdapter
import com.fauzan.covid.model.Hospital
import com.fauzan.covid.model.HospitalData
import com.fauzan.covid.model.IndonesiaData
import com.fauzan.covid.ui.loadImage
import kotlinx.android.synthetic.main.fragment_indonesia.*
import java.text.DecimalFormat

class IndonesiaFragment : Fragment() {

    private val hospitalList = ArrayList<Hospital>()
    private lateinit var indonesiaViewModel: IndonesiaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_indonesia, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        map_indo.loadImage(R.drawable.map_indo)
        tv_pandemi.text = getString(R.string.daftar_rumah_sakit)
        showHospitalList()

        //Get ViewModel
        indonesiaViewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(IndonesiaViewModel::class.java)

        indonesiaViewModel.setData()

        //Observe Change
        indonesiaViewModel.getData().observe(viewLifecycleOwner, Observer { data ->
            setViewData(data)
        })
    }



    private fun showHospitalList() {
        rv_hospital.layoutManager = LinearLayoutManager(context)
        val hospitalAdapter = HospitalAdapter(hospitalList)
        rv_hospital.adapter = hospitalAdapter
        hospitalList.addAll(HospitalData.list)
        rv_hospital.setHasFixedSize(true)
    }

    private fun setViewData(data: IndonesiaData) {
        val formatter = DecimalFormat("#,###,###")
        val confirm = formatter.format(data.confirmed.value)
        val recover = formatter.format(data.recovered.value)
        val dead = formatter.format(data.deaths.value)

        tv_positif_id.text = confirm
        tv_recover_id.text = recover
        tv_dead_id.text = dead
    }
}