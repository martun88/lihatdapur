package com.meivaldi.mejile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 19/12/16.
 */

public class Result {

    @SerializedName("user")
    @Expose
    private User user;

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }
}
