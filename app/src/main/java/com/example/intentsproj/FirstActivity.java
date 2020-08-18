package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        LayoutInflater li = getLayoutInflater();
        final View layout = li.inflate((R.layout.custom_toast), (ViewGroup) findViewById(R.id.custom_toast_layout));

        Button ok_button = (Button)findViewById(R.id.button_a1);
        final EditText val1 = findViewById(R.id.num_one_a1);
        final EditText val2 = findViewById(R.id.num_two_a1);

        ok_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Context context = getApplicationContext();
               CharSequence message = "Sending Messgae...";

               int duration = Toast.LENGTH_SHORT;

                Toast toast =  Toast.makeText(context,message,duration);

                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);


                toast.show();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                intent.putExtra("value1",val1.getText().toString());
                intent.putExtra("value2",val2.getText().toString());
                startActivity(intent);





            }
        });


        }


    }


