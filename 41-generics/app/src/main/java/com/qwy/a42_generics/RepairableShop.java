package com.qwy.a42_generics;

public interface RepairableShop<T> extends  Shop<T> {

    void repair(T item);
}
