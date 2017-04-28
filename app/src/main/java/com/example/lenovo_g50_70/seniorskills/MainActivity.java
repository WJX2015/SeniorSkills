package com.example.lenovo_g50_70.seniorskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button parcelable;
    private Button serializable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        parcelable= (Button) findViewById(R.id.Parcelable);
        serializable= (Button) findViewById(R.id.Serializable);
        parcelable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParcelableIntent();
            }
        });
        serializable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SerializableIntent();
            }
        });
    }

    private void ParcelableIntent() {//拆分
        Human human =new Human("Mike",20);
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("human_data",human);
        startActivity(intent);
    }

    private void SerializableIntent() {//序列化
        Person person =new Person("Tom",20);
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("person_data",person);
        startActivity(intent);
    }
}
