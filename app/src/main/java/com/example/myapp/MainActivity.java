
package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstNo, etSecondNo;
    private Button btnSum, btnSub;
    int first, second, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        etFirstNo = findViewById(R.id.etFirstNo);
        etSecondNo = findViewById(R.id.etSecond);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSubtract);

        // Button ko click listener
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirstNo.getText().toString());
                second = Integer.parseInt(etSecondNo.getText().toString());
                result = first + second;

                // for output
                Toast.makeText(MainActivity.this, "Sum is " + result, Toast.LENGTH_LONG).show();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirstNo.getText().toString());
                second = Integer.parseInt(etSecondNo.getText().toString());
                result = first - second;
                Toast.makeText(MainActivity.this, "Subtraction is " + result, Toast.LENGTH_LONG).show();
            }
        });
    }
    //kgklrngrngkr nngrnmg rk?
}


