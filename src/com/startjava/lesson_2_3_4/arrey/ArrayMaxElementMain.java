package com.startjava.lesson_2_3_4.arrey;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int maxLight = scan.nextInt();
        int[] numbers = new int[maxLight];
        System.out.print("Заполните массив целыми числами через массив: ");
        for (int i = 0; i < maxLight; i++) {
            numbers[i] = scan.nextInt();
        }
        int max = numbers[0];
        for (int i = 0; i < maxLight - 1; i++) {
            if (max < numbers[i+1]){
                max = numbers[i+1];
            }
        }

        System.out.println("Максимальное число: " + max);
    }

}

