package com.example.galaxycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText FirstNumber = findViewById(R.id.FirstNum);
        EditText SecondNumber = findViewById(R.id.SecondNum);
        Button Plus = findViewById(R.id.Plus);
        Button Minus = findViewById(R.id.Minus);
        Button Multiply = findViewById(R.id.Multiply);
        Button Division = findViewById(R.id.Division);
        TextView Equals = findViewById(R.id.Equals);


        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = FirstNumber.getText().toString();
                String b = SecondNumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x + y;

                Equals.setText(String.valueOf(z));

            }
        });

        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = FirstNumber.getText().toString();
                String b = SecondNumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x - y;

                Equals.setText(String.valueOf(z));

            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = FirstNumber.getText().toString();
                String b = SecondNumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x * y;

                Equals.setText(String.valueOf(z));

            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = FirstNumber.getText().toString();
                String b = SecondNumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x / y;

                Equals.setText(String.valueOf(z));

            }
        });



    }
}