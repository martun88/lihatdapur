package com.meivaldi.mejile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 19/12/16.
 */

public class User {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("password")
    @Expose
    private String password;

    public User (String name, String password, String email) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getName () {
        return name;
    }

    public String getEmail () {
        return email;
    }

    public String getPassword () {
        return password;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPassword (String password) {
        this.password = password;
    }
}
