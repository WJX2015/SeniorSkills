package com.example.lenovo_g50_70.seniorskills;

import java.io.Serializable;

/**
 * Created by lenovo-G50-70 on 2017/3/20.
 * Intent 可序列化传递自定义对象
 */

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
