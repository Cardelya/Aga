package com.example.aga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView answers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        answers = (TextView)findViewById(R.id.textAnswers);


        Intent intent = getIntent();

        String firstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("LastName");
        String patron = intent.getStringExtra("Age");

        answers.setText("Ваше имя: " + firstName + ". " + "Ваша фамилия: " + lastName +". " + "Ваше отчество: " + patron + ". " );
    }
}