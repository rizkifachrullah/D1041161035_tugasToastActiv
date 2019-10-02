package com.example.d1041161035_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text_inputNama;

    public static final String EXTRA_MESSAGE =
            "com.example.android.d1041161035_tugastoastactiv.extra.MESSAGE";

    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_inputNama = findViewById(R.id.text_Nama);
    }

    public void launchSecondActivity(View view) {
        String message = text_inputNama.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        message = text_inputNama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}
