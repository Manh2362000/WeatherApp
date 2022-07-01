package com.example.weatherapp.network;


import com.example.weatherapp.model.Wheather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiManager {
    public static String BASE_URL = "http://dataservice.accuweather.com";

    @GET("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/353412?apikey=owgIy5x8YWs3uoCRJjQCLpv8t6GmK0av&language=vi-vn&metric=true")
    Call<List<Wheather>> getHour();

    @GET("http://dataservice.accuweather.com/forecasts/v1/daily/5day/353412?apikey=owgIy5x8YWs3uoCRJjQCLpv8t6GmK0av&language=vi-vn&metric=true")
    Call<List<Wheather>> getDay();
}
