package ru.otus.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public boolean eat(Plate plate) {
        satiety = plate.consumeAmount(appetite);
        if (plate.consumeAmount(appetite) == true) {
            System.out.println(name + " поел, он сыт");
        } else {
            System.out.println(name + " еды не хватило, он не поел");
        }
        return satiety;
    }
}