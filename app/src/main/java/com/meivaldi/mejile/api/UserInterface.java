package com.meivaldi.mejile.api;

import com.meivaldi.mejile.model.Result;
import com.meivaldi.mejile.model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by root on 19/12/16.
 */

public interface UserInterface {

    @GET("users")
    Call<User> getResultUser();

    @GET("users")
    Call<ResponseBody> getResultAsJSON();

}
