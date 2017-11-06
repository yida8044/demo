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
        ImageView ib_profile=(ImageView)findViewById(R.id.ib_profile);
        ib_profile.setOnClickListener(this);
        ImageView ib_contact_list=(ImageView)findViewById(R.id.ib_contact_list);
        ib_contact_list.setOnClickListener(this);

    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.iv_search:
                Intent intent=new Intent(MainActivity.this,Top_search.class);
                startActivity(intent);
                break;
            case R.id.ib_profile:
                Intent intent1=new Intent(MainActivity.this,MyInfo.class);
                startActivity(intent1);
                break;
            case R.id.ib_contact_list:
                Intent intent2=new Intent(MainActivity.this,Fragment_contact_list.class);
                startActivity(intent2);
                break;
        }
      /*  Intent intent=new Intent(MainActivity.this,Top_search.class);
        startActivity(intent);
        Intent intent1=new Intent(MainActivity.this,MyInfo.class);
        startActivity(intent1);*/
    }


}
