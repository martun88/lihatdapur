package com.meivaldi.mejile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class SettingActivity extends AppCompatActivity {
    private static ListView lvSettings;
    private static String[] NAMES = new String[] {"Edit Profil", "Ketentuan Pemakainan", "Pengaturan Privacy", "Tentang Kami"};
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        btnLogout = (Button) findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityTesting.class));
            }
        });

        lvSettings = (ListView) findViewById(R.id.lvSettings);
        String[] data = new String[] {"Pertama", "Kedua"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.setting_list, NAMES);
        lvSettings.setAdapter(adapter);

        lvSettings.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String value = (String) lvSettings.getItemAtPosition(position);
                if (position == 0) {
                  startActivity(new Intent(getApplicationContext(), EditProfileActivity.class));
                }
            }
        });
    }
}
