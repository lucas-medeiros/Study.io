package com.example.zedlucas.studyio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();
        String name;
        name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int level = intent.getIntExtra("level", -1);

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWellcomeMsg);
        EditText etUsername = (EditText) findViewById(R.id.etUsername);
        EditText etAge = (EditText) findViewById(R.id.etConfirmPassword);

        // Display user details
        String message = "Welcome to your user area";
        tvWelcomeMsg.setText(message);
        etUsername.setText(username);
        etAge.setText(level + "");
    }
}
