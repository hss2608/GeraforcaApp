package com.geraforca.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.geraforca.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnClientes).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ClienteActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btnOfertas).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, OfertaActivity.class);
            startActivity(intent);
        });
    }
}