package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button addB = findViewById(R.id.add);
        Button minusB = findViewById(R.id.sub);
        Button multiplyB = findViewById(R.id.mult);
        Button divdB = findViewById(R.id.div);

        Intent intent = getIntent();
        final EditText val1 = findViewById(R.id.num_one_a2);
        final EditText val2 = findViewById(R.id.num_two_a2);
        final TextView value3 = findViewById(R.id.finalvalue);

        val1.setText(intent.getStringExtra("value1"));
        val2.setText(intent.getStringExtra("value2"));


        addB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int finalvalue = Integer.parseInt(val1.getText().toString()) + Integer.parseInt(val2.getText().toString());
                value3.setText(val1.getText().toString() + " + " + val2.getText().toString() + " =" + String.valueOf(finalvalue));

            }
        });
        minusB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int finalvalue = Integer.parseInt(val1.getText().toString()) - Integer.parseInt(val2.getText().toString());
                value3.setText(String.valueOf(finalvalue));

            }
        });
        multiplyB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int finalvalue = Integer.parseInt(val1.getText().toString()) * Integer.parseInt(val2.getText().toString());
                value3.setText(String.valueOf(finalvalue));

            }
        });
        divdB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int finalvalue = Integer.parseInt(val1.getText().toString()) / Integer.parseInt(val2.getText().toString());
                value3.setText(String.valueOf(finalvalue));

            }
        });


    }
}