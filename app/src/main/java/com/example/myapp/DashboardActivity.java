package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd, btnCon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAdd = findViewById(R.id.btnAdd);
        btnCon = findViewById(R.id.btnCon);

        btnAdd.setOnClickListener(this);
        btnCon.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnAdd) {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.btnCon) {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }
}

