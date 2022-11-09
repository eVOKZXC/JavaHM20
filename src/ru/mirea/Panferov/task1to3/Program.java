package ru.mirea.Panferov.task1to3;

public class Program {
    public static void main(String[] args){
        MyClass<String, Animal, Integer> myclass = new MyClass<String, Animal, Integer>("a", new Animal(4, "Bebroid"), 123);
        myclass.getType();
    }
}
