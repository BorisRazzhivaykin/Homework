package ru.otus.homework5;

public class Cat extends Animals {

    public Cat(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }

    @Override
    public void info() {
        System.out.println("Меня зовут: " + name + " , скорость бега: " + runSpeed + " , количество энергии: " + endurance);
    }
}
