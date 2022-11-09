package ru.mirea.Panferov.task4;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> tempMas = new ArrayList<>();
        tempMas.add(12);
        tempMas.add(-23);
        tempMas.add(3);
        tempMas.add(7);
        MinMax<Integer> mas1 = new MinMax<>(tempMas);
        System.out.println(mas1.max());
        System.out.println(mas1.min());

        ArrayList<String> tempMas1 = new ArrayList<>();
        tempMas1.add("Buster");
        tempMas1.add("Cherep!");
        tempMas1.add("Hi!");
        MinMax<String> mas2 = new MinMax<>(tempMas1);
        System.out.println(mas2.max());
        System.out.println(mas2.min());

    }
}
