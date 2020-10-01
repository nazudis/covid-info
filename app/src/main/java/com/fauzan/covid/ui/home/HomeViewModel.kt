package com.fauzan.covid.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fauzan.covid.api.RetrofitClient
import com.fauzan.covid.model.GlobalData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel : ViewModel() {

    val data = MutableLiveData<GlobalData>()

    fun setData() {

        RetrofitClient.instance.getData().enqueue(object : Callback<GlobalData> {
            override fun onFailure(call: Call<GlobalData>, t: Throwable) {
                Log.d("onFailure...", t.message.toString())
            }

            override fun onResponse(call: Call<GlobalData>, response: Response<GlobalData>) {
                val dataCovid = response.body()

                try {
                    if (dataCovid != null) {
                        data.postValue(dataCovid)
                    }
                } catch (e: Exception) {
                    Log.d("Exception ..", e.message.toString())
                }
            }

        })
    }

    fun getData(): LiveData<GlobalData> {
        return data
    }
}