package com.fauzan.covid.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.fauzan.covid.R
import com.fauzan.covid.model.GlobalData
import com.fauzan.covid.ui.loadImage
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.DecimalFormat

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       showImage()

        //Get ViewModel
        homeViewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(HomeViewModel::class.java)

        homeViewModel.setData()

        //Observe Change
        homeViewModel.getData().observe(viewLifecycleOwner, Observer { data ->
            setViewData(data)
        })
    }

    private fun showImage() {
        maps_global.loadImage(R.drawable.maps)
        img_symptoms.loadImage(R.drawable.ic_symptoms)
        img_bottle.loadImage(R.drawable.ic_water)
        img_humancontact.loadImage(R.drawable.ic_shake)
        img_animal.loadImage(R.drawable.ic_animal)
        img_mask.loadImage(R.drawable.ic_mask)
        img_washhand.loadImage(R.drawable.ic_wash)
        img_tissue.loadImage(R.drawable.ic_tissue)
        img_doctor.loadImage(R.drawable.ic_doctor)
    }

    private fun setViewData(data: GlobalData) {
        val formatter = DecimalFormat("#,###,###")
        val confirm = formatter.format(data.confirmed.value)
        val recover = formatter.format(data.recovered.value)
        val dead = formatter.format(data.deaths.value)

        tv_positif.text = confirm
        tv_recover.text = recover
        tv_dead.text = dead
    }
}