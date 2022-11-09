package ru.mirea.Panferov.task1to3;

import java.io.Serializable;

public class Animal implements Serializable {
    private int countLegs;
    private String name;

    public Animal(int countLegs, String name) {
        this.countLegs = countLegs;
        this.name = name;
    }
}
