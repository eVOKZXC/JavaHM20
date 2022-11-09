package ru.mirea.Panferov.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMax<T extends Comparable<T>> {
    private final ArrayList<T> list = new ArrayList<>();

    public MinMax(T[] mas) {
        list.addAll(Arrays.asList(mas));
    }

    public MinMax(ArrayList<T> mas) {
        list.addAll(mas);
    }

    public T max(){
        return Collections.max(list);
    }

    public T min(){
        return Collections.min(list);
    }
}
