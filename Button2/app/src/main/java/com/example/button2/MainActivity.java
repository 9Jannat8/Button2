package com.example.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton, logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginid);
        logoutButton = findViewById(R.id.logoutid);
        textView  = findViewById(R.id.textviewid);

        loginButton.setOnClickListener(this);
        logoutButton.setOnClickListener(this);




//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText("Login!");
//            }
//        });
//
//        logoutButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText("Logout");
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginid){
            textView.setText("Login button is clicked!");
        }
        if(v.getId()==R.id.logoutid ){
            textView.setText("Logout Button is clicked!");
        }
    }
}