package com.qwy.a42_generics;

public class Wrapper<T> {


    private T instance;


    public T getInstance() {
        return instance;
    }


    public void setInstance(T instance) {
        this.instance = instance;
    }
}
