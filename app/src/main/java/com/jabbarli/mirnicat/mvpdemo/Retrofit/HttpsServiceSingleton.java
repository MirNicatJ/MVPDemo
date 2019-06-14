package com.jabbarli.mirnicat.mvpdemo.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpsServiceSingleton {

    private static HttpsServiceSingleton instance = null;
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    private RetrofitInterface retrofitInterface;

    public static HttpsServiceSingleton getInstance(){

        if (instance == null){
            instance = new HttpsServiceSingleton();
        }

        return instance;
    }

    private HttpsServiceSingleton(){
        buildRetrofit(BASE_URL);
    }

    private void buildRetrofit(String baseUrl){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.retrofitInterface = retrofit.create(RetrofitInterface.class);
    }

    public RetrofitInterface getRetrofitInterface() {
        return retrofitInterface;
    }
}
