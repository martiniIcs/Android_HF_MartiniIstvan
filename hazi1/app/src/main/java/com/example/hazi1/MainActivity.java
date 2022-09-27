package com.example.hazi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v){
        EditText a = (EditText) findViewById(R.id.editTextNumber);
        EditText b = (EditText) findViewById(R.id.editTextNumber2);
        EditText c = (EditText) findViewById(R.id.editTextNumber3);

        int a1 = Integer.parseInt(a.getText().toString());
        int b1 = Integer.parseInt(b.getText().toString());
        int result=a1+b1;
        c.setText(" "+result);
    }

    public void Divide(View v){
        EditText a = (EditText) findViewById(R.id.editTextNumber);
        EditText b = (EditText) findViewById(R.id.editTextNumber2);
        EditText c = (EditText) findViewById(R.id.editTextNumber3);

        int a1 = Integer.parseInt(a.getText().toString());
        int b1 = Integer.parseInt(b.getText().toString());
        int result=a1/b1;
        c.setText(" "+result);
    }

    public void Multiple(View v){
        EditText a = (EditText) findViewById(R.id.editTextNumber);
        EditText b = (EditText) findViewById(R.id.editTextNumber2);
        EditText c = (EditText) findViewById(R.id.editTextNumber3);

        int a1 = Integer.parseInt(a.getText().toString());
        int b1 = Integer.parseInt(b.getText().toString());
        int result=a1*b1;
        c.setText(" "+result);
    }

    public void Subtract(View v){
        EditText a = (EditText) findViewById(R.id.editTextNumber);
        EditText b = (EditText) findViewById(R.id.editTextNumber2);
        EditText c = (EditText) findViewById(R.id.editTextNumber3);

        int a1 = Integer.parseInt(a.getText().toString());
        int b1 = Integer.parseInt(b.getText().toString());
        int result=a1-b1;
        c.setText(" "+result);
    }
}