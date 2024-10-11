package ru.otus.homework1;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        greetings();
        checkSign(2, -7, -9);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(2, 8, false);
        application();
    }

    //Решение задачи №1
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    //Решение задачи №2
    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Решение задачи №3
    public static void selectColor() {
        int data = 26;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    //Решение задачи №4
    public static void compareNumbers() {
        int a = 3;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Решение задачи №5
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    //Решение задачи со *
    public static void application() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int n = scanner.nextInt();
        if (n == 1) {
            greetings();
        } else if (n == 2) {
            checkSign(2, -7, -9);
        } else if (n == 3) {
            selectColor();
        } else if (n == 4) {
            compareNumbers();
        } else if (n == 5) {
            addOrSubtractAndPrint(2, 8, false);
        }
    }
}