package com.example.administrator.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv_search=(ImageView)findViewById(R.id.iv_search);
        iv_search.setOnClickListener(this);
    }
    public void onClick(View view){
        Intent intent=new Intent(MainActivity.this,Top_search.class);
        startActivity(intent);
    }

}
