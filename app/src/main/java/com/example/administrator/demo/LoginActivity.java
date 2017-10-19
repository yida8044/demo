package com.example.administrator.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/10/16.
 */

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login=(Button)findViewById(R.id.login_button);
        login.setOnClickListener(this);

    }
    public void onClick(View view){
        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
    }

}
