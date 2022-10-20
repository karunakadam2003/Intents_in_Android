package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
        public static final String NAME = "NAME";
        public static final String EMAIl = "EMAIL";

    String name;
    String email;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txt1;
        TextView txt2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = findViewById(R.id.nameTV);
        txt2 = findViewById(R.id.emailTV);
        button = findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.URL);




        Intent i =  getIntent() ;
        name = i.getStringExtra ( NAME ) ;
        email = i.getStringExtra(EMAIl);
        txt2.setText ( " You have signed in as ! " + email ) ;
        txt1.setText ( " Hello ! " + name ) ;
        txt2.setText ( " You have signed in as ! " + email ) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}