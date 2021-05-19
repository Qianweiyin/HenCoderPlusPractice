package com.qwy.a42_generics;

import java.util.Arrays;

public class HenCoderList<T> {


//    public static T special;


//    private T[] instances = new T[0];
    private Object[] instances = new Object[0];



    public T getInstance(int index) {
        return (T) instances[index];
    }


    public void setInstance(int index,T instance) {
        this.instances[index] = instance;
    }

    public void add(T newInstance) {
        instances = Arrays.copyOf(instances, instances.length + 1);
        instances[instances.length - 1] = newInstance;
    }

}
