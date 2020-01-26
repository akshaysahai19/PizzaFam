package com.test.pizzafam.api;

import com.test.pizzafam.model.PizzaInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://ipsator-android-test.free.beeceptor.com/pizzas/";

    @GET("1/")
    Call<PizzaInfo> getPizzaInfo();

}
