package ru.otus.homework5;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Бэнджамин", 3, 51);
        Dog dog = new Dog("Грэй", 4, 3, 210);
        Horse horse = new Horse("Огонёк", 8, 2, 410);

        cat.info();
        dog.info();
        horse.info();

        System.out.println(cat.run(50));
        System.out.println(dog.run(50));
        System.out.println(horse.run(50));
        System.out.println(dog.swim(50));
        System.out.println(horse.swim(90));
    }
}
