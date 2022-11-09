package ru.mirea.Panferov.task1to3;

import java.io.Serializable;

public class MyClass<T extends Comparable, V extends Animal & Serializable, K>{
    private T a;
    private V b;
    private K c;

    public MyClass(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() { return a; }
    public V getB() { return b; }
    public K getC() { return c; }

    public void getType(){
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
    }
}
