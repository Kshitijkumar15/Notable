package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mgotoforgotpassword;
    private EditText mloginemail, mloginpassword;
    private RelativeLayout mloginbutton, mgotosignup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mloginemail = findViewById(R.id.loginemail);
        mloginpassword = findViewById(R.id.loginpassword);
        mloginbutton = findViewById(R.id.loginbutton);
        mgotoforgotpassword = findViewById(R.id.gotoforgotpassword);
        mgotosignup = findViewById(R.id.gotosignup);


        mgotosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, signup.class));
            }
        });
        mgotoforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, forgotpassword.class));
            }
        });

        mloginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mloginemail.getText().toString().trim();
                String password = mloginpassword.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "All Fields are required", Toast.LENGTH_SHORT).show();
                } else {
                //login the user
                }
            }
            });
        }
    }