package com.example.d1041161035_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btn1,btn2;
    TextView result,name;
    int angka;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        name = findViewById(R.id.nama);
        name.setText("Hallo " + message);


        btn1=findViewById(R.id.btnup);
        btn2=findViewById(R.id.btndown);
        result=findViewById(R.id.hasil);
        angka=35;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka=angka+1;
                result.setText(String.valueOf(angka));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka=angka-1;
                result.setText(String.valueOf(angka));
            }
        });

    }
}
