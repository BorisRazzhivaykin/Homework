package ru.otus.homework5;

public class Dog extends Animals {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
        this.swimSpeed = swimSpeed;
    }

    @Override
    protected void info() {
        System.out.println("Собаку зовут: " + name + " , скорость бега: " + runSpeed + " , скорость плавания: " + swimSpeed + " , количество энергии: " + endurance);
    }

    protected int swim(int distance) {
        if ((distance * 2) >= endurance) {
            System.out.println(name + " устал, проплыть не сможет");
            return -1;
        } else {
            int time = distance / swimSpeed;
            endurance = endurance - (distance * 2);
            System.out.print(name + " проплыл за: ");
            return time;
        }
    }
}
