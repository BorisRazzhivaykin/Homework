package ru.otus.homework6;

public class Application {
    public static void main(String[] args) {
        Plate plate = new Plate(6, 6);
        Cat[] cats = {
                new Cat("Barsik", 1),
                new Cat("Murzik", 1),
                new Cat("Pushok", 1),
                new Cat("Toptysh", 1),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

    }
}