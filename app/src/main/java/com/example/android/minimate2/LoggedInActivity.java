package com.example.android.minimate2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        TextView tv = (TextView) findViewById(R.id.txtText);

        Intent intent = getIntent();
        User user = (User) intent.getParcelableExtra("extra_user");

        tv.setText(user.getFullName());
    }
}