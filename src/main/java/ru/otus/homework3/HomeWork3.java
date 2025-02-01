package ru.otus.homework3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] arr = {{3, -5, 6}, {10, -8, 5}};
        sumOfPositiveElements(arr);
        printSquare(3);
    }

    //Решение задачи №1
    public static void sumOfPositiveElements(int[][] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    summ += arr[i][j];
                }
            }
        }
        System.out.println(summ);
    }

    //    Решение Задачи №2
    public static void printSquare(int size) {
        char a = '*';
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a);
            }
            System.out.println(" ");
        }

    }
}