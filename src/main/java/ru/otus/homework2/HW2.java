package ru.otus.homework2;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        writeSomething(3, "Hello 'for'");
        int[] arr = {10, 4, 3, 11, 2, 17, 1};
        summAndPrint(arr);
        int[] arr1 = new int[5];
        addNumber(30, arr1);
        int[] arr2 = {1, 3, 5, 7, 9};
        summNumber(1, arr2);
        int[] arr3 = {10, 12, 14, 5, 8, 12, 15, 7, 10, 11};
        whatsMore(arr3);
        //Решения задач со звездочкой:
        newValues();
        findDot();
    }

    //Решение задачи №1
    public static void writeSomething(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(i + "." + str);
        }
    }

    //Решение задачи №2
    public static void summAndPrint(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                summ += arr[i];
            }
        }
        System.out.println("сумма значений >5 =" + " " + summ);
    }

    //    Решение задачи №3
    public static void addNumber(int b, int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = b;
        }
        System.out.println(Arrays.toString(arr1)); // это выставил для проверки, что массив заполнился нужным числом;
    }

    //Решение задачи №4
    public static void summNumber(int c, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += c;
        }
        System.out.println(Arrays.toString(arr2)); //это выставил, чтобы проверить увеличились ли значения на 1;
    }

    //Решение задачи №5
    public static void whatsMore(int[] arr3) {
        int summ1 = 0;
        int summ2 = 0;
        for (int i = 0; i < arr3.length / 2; i++) {
            summ1 += arr3[i];
        }
        for (int j = arr3.length / 2; j < arr3.length; j++) {
            summ2 += arr3[j];
        }
        if (summ1 > summ2) {
            System.out.println("Сумма первой половины больше и равна:" + " " + summ1);
        } else System.out.println("Сумма второй половины больше и равна:" + " " + summ2);

    }

    //Решение задачи №1 со звездочкой
    public static void newValues() {
        int[] value1 = {1, 1, 1, 1, 2, 2};
        int[] value2 = {4, 3, 7, 8};
        int[] valueFinal = new int[6];
        for (int i = 0; i < value1.length; i++) {
            valueFinal[i] = value1[i] + valueFinal[i];
        }
        for (int j = 0; j < value2.length; j++) {
            valueFinal[j] = value2[j] + valueFinal[j];
        }
        System.out.println(Arrays.toString(valueFinal));
    }

    //Решение задачи №2 со звездочкой Найти точку в массиве между которой сумма левой и правой половиной будут равны
    public static void findDot() {
        int[] dot = {2, 2, 1, 1, 1, 5};
        int counter = 0;
        if (dot[0] == dot[1] + dot[2] + dot[3] + dot[4] + dot[5]) {
            System.out.println("Точка найдена после первого значения");
        } else if (dot[0] + dot[1] == dot[2] + dot[3] + dot[4] + dot[5]) {
            System.out.println("Точка найдена после второго значения");
        } else if (dot[0] + dot[1] + dot[2] == dot[3] + dot[4] + dot[5]) {
            System.out.println("Точка найдена после третьего значения");
        } else if (dot[0] + dot[1] + dot[2] + dot[3] == dot[4] + dot[5]) {
            System.out.println("Точка найдена после четвертого значения");
        } else if (dot[0] + dot[1] + dot[2] + dot[3] + dot[4] == dot[5]) {
            System.out.println("Точка найдена после пятого значения");
        } else {
            System.out.println("Точка не найдена");
        }
        System.out.println(Arrays.toString(dot));
    }
}

