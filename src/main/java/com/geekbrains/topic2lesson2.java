package com.geekbrains;

import java.util.Arrays;
import java.util.Random;

public class topic2lesson2 {
    public static void main(String[] args) {
        taskDesigner(1);
        //1 задание 
        int [] firstArray = { 1, 1, 1, 0, 0, 0 };
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == 1) {
                firstArray[i] = 0;
            } else {
                firstArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));

        //2(1) первый вариант
        taskDesigner(2);
        int [] secondArray = new int [8];
        for (int i = 0; i < secondArray.length; i++) {
            if (i == 0) {
                secondArray[i] = i;
            } else {
                secondArray[i] = secondArray[i-1] + 3;
            }
        }
        System.out.println(Arrays.toString(secondArray));

        //2(2) второй вариант

        int [] testArray = new int [8];
        for(int i = 0; i < testArray.length * 3 ; i = i + 3) {
            int index = i / 3;
            testArray[index] = i;
        }
        System.out.println(Arrays.toString(testArray) + " способ 2");

        //3 задание
        taskDesigner(3);
        int [] givenArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] < 6) {
                int a = givenArray[i] * 2;
                givenArray[i] = a;
            }
        }
        System.out.println(Arrays.toString(givenArray));

        //4 задание
        taskDesigner(4);
        int counter = 0;
        int[][] squareArray = new int[5][5];
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                if (i == j || (i + j) == squareArray.length - 1) {
                    counter = 1;
                    squareArray[i][j] = counter;
                }
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
        //5 задание
        taskDesigner(5);
        int[] randomArray = new int[10];
        for(int i = 0; i < randomArray.length; i++) {
            Random randValue = new Random();
            randomArray[i] = randValue.nextInt( 25) - 5;
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println(maxValue(randomArray) + " max элемент");
        System.out.println(minValue(randomArray) + " min элемент");

        //6 задание
        taskDesigner(6);
        int[] testArrayNoEmpty =  { 1, 1, 1, 2, 1};
        System.out.println(Arrays.toString(testArrayNoEmpty));
        System.out.println(checkBalance(testArrayNoEmpty));


    }

    // к 5-у задание методы Мин и Макс
    public static int maxValue(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minValue(int[]arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // к 6-у задание метод
    public static boolean checkBalance(int[]notEmptyArr) {
        int sumArray = 0;
        for (int i = 0; i < notEmptyArr.length; i++) {
            sumArray = sumArray + notEmptyArr[i];
            }
            sumArray = sumArray % 2;
        if (sumArray == 0) {
            return true;
        }
        return false;
    }


    // Строчка для читабельности кода и удобной проверки дз
    public static String taskDesigner(int value) {
        String a = "---TASK " + value +"-----------------";
        System.out.println(a);
        return a;
    }
}
