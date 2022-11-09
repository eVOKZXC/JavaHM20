package ru.mirea.Panferov.task4;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax<T extends Comparable<? super T>> {
    private final ArrayList<T> mas;

    public MinMax(ArrayList<T> mas) {
        this.mas = mas;
    }

    public T max(){
        return Collections.max(mas);
    }

    public T min(){
        return Collections.min(mas);
    }


}