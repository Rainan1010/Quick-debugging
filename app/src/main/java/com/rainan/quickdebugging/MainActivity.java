package com.rainan.quickdebugging;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent developerOptionsIntent =
                new Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
        if (developerOptionsIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(developerOptionsIntent);
        } else {
            Toast.makeText(
                    this,
                    R.string.developer_options_unavailable,
                    Toast.LENGTH_LONG
            ).show();
        }

        finish();
    }
}
