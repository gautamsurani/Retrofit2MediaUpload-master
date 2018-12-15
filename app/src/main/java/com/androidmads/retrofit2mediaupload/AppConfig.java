package com.androidmads.retrofit2mediaupload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class AppConfig {

    private static String BASE_URL = "http://mushtaq.16mb.com/";

    static Retrofit getRetrofit() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
