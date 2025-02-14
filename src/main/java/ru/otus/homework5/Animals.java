package ru.otus.homework5;

public abstract class Animals {
    String name;
    int runSpeed;
    int swimSpeed;
    int endurance;

    protected abstract void info();

    protected int run(int distance) {
        if (distance > endurance) {
            System.out.println(name + " устал, пробежать не сможет");
            return -1;
        } else {
            int time = (distance / runSpeed);
            endurance = endurance - distance;
            System.out.print(name + " пробежал за: ");
            return time;
        }
    }
}
