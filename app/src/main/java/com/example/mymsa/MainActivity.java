package com.example.mymsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        final EditText usernameEditText = findViewById(R.id.username);
        final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);

        final ProgressBar loadingProgressBar = findViewById(R.id.loading);

        loginButton.setEnabled(true);

        loginButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingProgressBar.setVisibility(View.VISIBLE);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This is a message displayed in a Toast",
                        Toast.LENGTH_SHORT);

                toast.show();


               // setContentView(R.layout.activity_patient);
                Intent intent = new Intent(MainActivity.this,
                        Patient.class);

                startActivity(intent);
              //  start.setEnabled(true);

            }
        });



    }

}
