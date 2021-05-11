package com.qwy.a36_arch;

import java.util.Objects;

public class HashDemo {
    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashDemo hashDemo = (HashDemo) o;
        return age == hashDemo.age &&
                Objects.equals(name, hashDemo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
