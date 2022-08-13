package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameTextView = findViewById(R.id.TV1);
        TextView ageTextView = findViewById(R.id.TV2);

        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        nameTextView.setText(name);

        int customerAge = bundle.getInt("age");
        ageTextView.setText(String.valueOf(customerAge));

    }
}