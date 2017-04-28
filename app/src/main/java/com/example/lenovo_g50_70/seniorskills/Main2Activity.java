package com.example.lenovo_g50_70.seniorskills;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tv;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //获取序列化传过来的对象
        Person person = (Person) getIntent().getSerializableExtra("person_data");
        //获取先分解再组合的对象
        Human human =(Human) getIntent().getParcelableExtra("human_data");
        tv = (TextView) findViewById(R.id.tv);
        if(person!=null){
            tv.setText(person.getName()+" "+person.getAge());
        }else if(human!=null){
            tv.setText(human.getName()+" "+human.getAge());
        }else{
            tv.setText("Null Data");
        }
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
