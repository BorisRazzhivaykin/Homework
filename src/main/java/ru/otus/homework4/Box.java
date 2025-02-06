package ru.otus.homework4;

public class Box {
    private final int size = 10;
    private String color;
    private boolean empty = true;
    private boolean opened = true;

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка покрашена в " + color + " цвет");
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isOpened() {
        return opened;
    }

    public Box(String color) {
        this.color = color;
    }

    public void open() {
        System.out.println("Коробка открыта");
        opened = true;
    }

    public void close() {
        System.out.println("Коробка закрыта");
        opened = false;
    }

    public void info() {
        System.out.println("Информация о коробке: ");
        System.out.println("Цвет: " + color);
        System.out.println("Размер: " + size);
    }

    public void put() {
        if (opened == true) {
            if (empty == true) {
                System.out.println("Положили предмет в коробку");
                empty = false;
                opened = true;
            } else {
                System.out.println("Коробка заполнена, положить в нее предмет нельзя");
            }
        } else {
            System.out.println("Коробка закрыта, откройте коробку");
        }
    }

    public void trowAway() {
        if (opened == true) {
            if (empty == false) {
                System.out.println("Вытищили предмет, коробка пустая");
                empty = true;
                opened = true;
            } else {
                System.out.println("Из коробки нечего вытаскивать, она пустая");
            }
        } else {
            System.out.println("Коробка закрыта, откройте коробку");
        }
    }
}
