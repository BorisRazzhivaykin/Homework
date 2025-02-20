package ru.otus.homework6;

public class Application {
    public static void main(String[] args) {
        Plate plate = new Plate(15, 15);
        Cat[] cats = {
                new Cat("Barsik", 16),
                new Cat("Murzik", 15),
                new Cat("Pushok", 13),
                new Cat("Toptysh", 18),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

    }
}