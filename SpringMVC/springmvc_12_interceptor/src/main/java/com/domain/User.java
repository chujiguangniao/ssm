package com.domain;

public class User {

    private String name;
    private int value;


    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", value=" + value + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}