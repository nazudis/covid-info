package com.fauzan.covid.ui.indonesia

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fauzan.covid.api.RetrofitClient
import com.fauzan.covid.model.IndonesiaData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class IndonesiaViewModel : ViewModel() {

    val dataIndo = MutableLiveData<IndonesiaData>()

    fun setData() {

        RetrofitClient.instance.getDataIndo().enqueue(object : Callback<IndonesiaData> {
            override fun onFailure(call: Call<IndonesiaData>, t: Throwable) {
                Log.d("onFailure...", t.message.toString())
            }

            override fun onResponse(call: Call<IndonesiaData>, response: Response<IndonesiaData>) {
                val dataIndonesia = response.body()

                try {
                    if (dataIndonesia != null) {
                        dataIndo.postValue(dataIndonesia)
                    }
                } catch (e: Exception) {
                    Log.d("Exception ..", e.message.toString())
                }
            }

        })
    }

    fun getData(): LiveData<IndonesiaData> {
        return dataIndo
    }
}