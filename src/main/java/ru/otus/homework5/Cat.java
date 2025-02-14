package ru.otus.homework5;

public class Cat extends Animals {

    public Cat(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }

    @Override
    protected void info() {
        System.out.println("Кота зовут: " + name + " , скорость бега: " + runSpeed + " , количество энергии: " + endurance);
    }
}
