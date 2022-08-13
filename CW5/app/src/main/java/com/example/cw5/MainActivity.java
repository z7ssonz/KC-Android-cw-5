package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.ET1);
        EditText age = findViewById(R.id.ET2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



           if (name.getText().toString().isEmpty()) {
               System.out.println("please write the name");

           }
           else if(age.getText().toString().isEmpty()) {

               System.out.println("please write the age");
           }


           else {
               String customerName = name.getText().toString();
               int customerAge = Integer.parseInt(age.getText().toString());

               Intent intent = new Intent(MainActivity.this, MainActivity2.class);

               intent.putExtra("name", customerName);
               intent.putExtra("age", customerAge);

               startActivity(intent);


}
}
});




    }



}