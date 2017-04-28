package com.example.lenovo_g50_70.seniorskills;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by lenovo-G50-70 on 2017/3/20.
 * Intent 分解传递自定义对象
 * 常用方法
 */

public class Human implements Parcelable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {return age;}

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Human() {
    }

    public Human(String name,int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //对象拆分
        dest.writeString(name);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Human> CREATOR = new Creator<Human>() {
        @Override
        public Human createFromParcel(Parcel source) {
            //对象组合
            Human human =new Human();
            human.name=source.readString();
            human.age=source.readInt();
            return human;
        }

        @Override
        public Human[] newArray(int size) {
            return new Human[size];
        }
    };
}
