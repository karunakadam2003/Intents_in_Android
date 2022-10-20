package com.example.intents;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText name,email,password;
        Button button;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(name.length() == 0 || password.length() == 0){
                    Toast.makeText(getBaseContext(),"Name or Password can not be null",Toast.LENGTH_SHORT).show();

                }else{
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.setType("text/plain");
                    intent.putExtra(MainActivity2.NAME, name.getText().toString());
                    intent.putExtra(MainActivity2.EMAIl, email.getText().toString());

                    startActivity(intent);

                }


            }

        });



    }
}