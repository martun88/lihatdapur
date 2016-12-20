package com.meivaldi.mejile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.meivaldi.mejile.api.ApiClient;
import com.meivaldi.mejile.api.UserInterface;
import com.meivaldi.mejile.model.Result;
import com.meivaldi.mejile.model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityTesting extends AppCompatActivity {
    public static final String BASE_URL = "http://584e5e717ba93b12001db550.mockapi.io/api/v1/user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        Button btnShow = (Button) findViewById(R.id.showApi);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getProfile();
            }
        });
    }

    private void getProfile () {
        UserInterface userInterface = ApiClient.getClient().create(UserInterface.class);
        Call<User> call = userInterface.getResultUser();

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(getApplicationContext(), response.body().getName(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}
