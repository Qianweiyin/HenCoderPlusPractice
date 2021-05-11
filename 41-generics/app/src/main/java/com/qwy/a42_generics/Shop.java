package com.qwy.a42_generics;

public interface Shop<T> {
    T buy();

    float refund(T item);
}
