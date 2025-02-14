package ru.otus.homework5;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Бэнджамин", 3, 50);
        Dog dog = new Dog("Грэй", 4, 3, 60);
        Horse horse = new Horse("Стрела", 8, 2, 100);
        cat.info();
        dog.info();
        horse.info();
    }
}
