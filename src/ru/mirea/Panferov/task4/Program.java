package ru.mirea.Panferov.task4;

public class Program {
    public static void main(String[] args) {
        MinMax<Integer> integerMinMax = new MinMax<>(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(integerMinMax.max());
        System.out.println(integerMinMax.min());

        MinMax<String> stringMinMax = new MinMax<>(new String[]{"Polkovnik", "Bebra", "Cherep", "Work"});
        System.out.println(stringMinMax.max());
        System.out.println(stringMinMax.min());
    }
}
