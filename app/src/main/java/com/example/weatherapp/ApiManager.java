package com.example.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "http://dataservice.accuweather.com";
    @GET("/forecasts/v1/daily/5day/353412?apikey=WVH4gF5doA4de25sOnMi5QHQBuV4Ba3J")
    Call<List<Weather>> getDay();
    @GET("/forecasts/v1/hourly/12hour/353412?apikey=WVH4gF5doA4de25sOnMi5QHQBuV4Ba3J")
    Call<List<Weather>> getHour();

}
