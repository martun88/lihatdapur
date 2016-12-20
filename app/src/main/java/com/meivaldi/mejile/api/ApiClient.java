package com.meivaldi.mejile.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by root on 19/12/16.
 */

public class ApiClient {
    public static final String BASE_URL = "http://localhost:8000";
    public static Retrofit retrofit = null;

    public static Retrofit getClient () {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
