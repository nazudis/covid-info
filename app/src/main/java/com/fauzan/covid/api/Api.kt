package com.fauzan.covid.api

import com.fauzan.covid.model.GlobalData
import com.fauzan.covid.model.IndonesiaData
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("api")
    fun getData() : Call<GlobalData>

    @GET("api/countries/ID")
    fun getDataIndo() : Call<IndonesiaData>
}