package ru.otus.homework6;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean satiety = false; //сытость

    protected Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    protected boolean eat(Plate plate) {
        if (appetite > plate.currentAmmountOfFood) {
            System.out.println("Еды не хватает, положите еще еды, " + name + " остался голодным");
        }
        if (appetite <= plate.currentAmmountOfFood) {
            System.out.println(name + " поел, он насытился");
            satiety = true;
        }
        return satiety;
    }
}