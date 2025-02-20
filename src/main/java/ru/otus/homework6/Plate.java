package ru.otus.homework6;

public class Plate {
    int currentAmmountOfFood; //текущее количество еды (указывается при создании тарелки)
    protected int maxPlateVolume; // максимальный объём тарелки (указывается при создании тарелки)
    protected int foodAmmount; //количество добавляемой еды

    protected Plate(int currentAmmountOfFood, int maxPlateVolume) {
        this.currentAmmountOfFood = currentAmmountOfFood;
        this.maxPlateVolume = maxPlateVolume;
    }

    protected void putFoodInPlate() {
        if (currentAmmountOfFood == maxPlateVolume) {
            System.out.println("Тарелка полная, положить еду нельзя");
        }
        if (currentAmmountOfFood < maxPlateVolume) {
            foodAmmount = maxPlateVolume - currentAmmountOfFood;
            currentAmmountOfFood += foodAmmount;
            System.out.println("Положили в тарелку еды в количестве: " + foodAmmount);
        }
    }

    protected boolean reductionOfFood(Cat cats) {
        boolean statusOfFoodInPlate = true;
        if (currentAmmountOfFood >= cats.appetite) {
            currentAmmountOfFood = currentAmmountOfFood - cats.appetite;
            System.out.println("Еды стало меньше, убавилось до: " + currentAmmountOfFood);
            statusOfFoodInPlate = true;
        }
        if (currentAmmountOfFood < cats.appetite) {
            System.out.println("Нельзя уменьшить количество еды");
            statusOfFoodInPlate = false;
        }
        return statusOfFoodInPlate;
    }
}
