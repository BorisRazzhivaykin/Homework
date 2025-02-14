package ru.otus.homework5;

public class Dog extends Animals {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void info() {
        System.out.println("Меня зовут: " + name + " , скорость бега: " + runSpeed + " , скорость плавания: " + swimSpeed + " , количество энергии: " + endurance);
    }
}
