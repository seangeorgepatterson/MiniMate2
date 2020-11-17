package com.example.android.minimate2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText txtUsername;
    private EditText txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();
                login(username, password);
            }
        });
    }

    private void login(String un, String pwd){

        if(!un.equals("") && !pwd.equals("")) {
            Toast.makeText(getApplicationContext(), "login", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "fail", Toast.LENGTH_SHORT).show();
        }
    }





}