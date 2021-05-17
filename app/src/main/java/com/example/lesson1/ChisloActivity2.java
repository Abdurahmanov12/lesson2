package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChisloActivity2 extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chislo2);
        initView();
        initListeners();
    }

    private void initView(){
        editText = findViewById(R.id.login_et);
        button = findViewById(R.id.button_chislo);
    }

    private void initListeners(){
        button.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("number",editText.getText().toString());
            setResult(RESULT_OK,intent);
            finish();
        });
    }
}