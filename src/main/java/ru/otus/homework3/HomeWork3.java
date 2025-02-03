package ru.otus.homework3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] arr = {{3, -5, 6}, {10, -8, 5}};
        sumOfPositiveElements(arr);
        printSquare(3);
        int[][] arr3 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        fillDiagonal(arr3);
        int[][] arr4 = {{17, -5, -7, -21, -5, -6}, {5, 14, -45, 6}};
        findMax(arr4);
        int[][] arr5 = {{1, 2, 3}, {5, 2, 2, 6}, {1, 1, 1, 1}};
        System.out.println(summElementsOfSecondString(arr5));
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

    //Решение Задачи №2
    public static void printSquare(int size) {
        char a = '*';
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a);
            }
            System.out.println(" ");
        }

    }

    //Решение Задачи №3
    public static void fillDiagonal(int[][] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i] == arr3[j]) {
                    arr3[i][j] = 0;
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    //Решение Задачи №4
    public static void findMax(int[][] arr4) {
        int maxNumber = arr4[0][0];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (arr4[i][j] > maxNumber) {
                    maxNumber = arr4[i][j];
                }
            }
        }
        System.out.println(maxNumber);
    }

    //Решение Задачи №5 (прошу проверить, мне кажется есть ошибка если нет второй стоки)
    public static int summElementsOfSecondString(int[][] arr5) {
        int summOfElements = 0;
        if (arr5.length < 2) {
            summOfElements = -1;
        } else {
            for (int i = 1; i < arr5.length - 1; i++) {
                for (int j = 0; j < arr5[i].length; j++) {
                    summOfElements += arr5[i][j];
                }
            }
        }
        return summOfElements;
    }
}