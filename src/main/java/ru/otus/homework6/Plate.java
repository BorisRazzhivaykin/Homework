package ru.otus.homework6;

public class Plate {
    private int currentAmount;
    private int maxAmount;

    public Plate(int currentAmount, int maxAmount) {
        this.currentAmount = currentAmount;
        this.maxAmount = maxAmount;
    }

    public void addFood(int amount) {
        if (currentAmount + amount > maxAmount) {
            System.out.println("Тарелка полная, положить еду нельзя");
        } else {
            currentAmount += amount;
            System.out.println("Положили в тарелку еды в количестве: " + amount);
        }
    }

    public boolean consumeAmount(int amount) {
        if (currentAmount - amount >= 0 && currentAmount >= amount) {
            currentAmount -= amount;
            return true;
        }
        return false;
    }
}
