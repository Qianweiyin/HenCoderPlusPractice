package com.qwy.a42_generics;

import java.util.Arrays;

public class NoGenericList {


    private Object[] instances = new Object[0];


    public Object getInstance(int index) {
        return instances[index];
    }


    public void setInstance(int index, Object instance) {
        this.instances[index] = instance;
    }

    public void add(Object newInstance) {
        instances = Arrays.copyOf(instances, instances.length + 1);
        instances[instances.length - 1] = newInstance;
    }

}
