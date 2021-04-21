package com.startjava.lesson_2_3_4.game;

import java.sql.Array;
import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int tryNumber;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        tryNumber++;
        numbers[tryNumber - 1] = number;
    }

    public int getTryNumber() {
        return tryNumber;
    }


    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void clear() {
        Arrays.fill(numbers, 0, tryNumber, 0);
        tryNumber = 0;
    }
}