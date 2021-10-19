package android.example.kotlinclone

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface RetrofitAPI {
    @GET("us/daily.json")
    fun getNationalData(): Call<List<CovidData>>

    //getting the state wise data
    @GET("states/daily.json")
    fun getStateData():Call<List<CovidData>>
}