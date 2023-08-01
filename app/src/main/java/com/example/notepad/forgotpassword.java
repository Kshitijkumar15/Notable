package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class forgotpassword extends AppCompatActivity {
    private EditText mforgotpassword;
    private Button mpasswordrecover;
    private TextView mgobacktologin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
//        getSupportActionBar().hide();
        mforgotpassword = findViewById(R.id.forgotpassword);
        mpasswordrecover = findViewById(R.id.passwordrecover);
        mgobacktologin = findViewById(R.id.gobacktologin);


         mgobacktologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(forgotpassword.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mpasswordrecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mforgotpassword.getText().toString().trim();
                if (email.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter your Email first", Toast.LENGTH_SHORT).show();
                } else {
                    //sending code
                }
            }
        });
    }
}