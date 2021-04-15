package com.startjava.lesson_2_3_4.game;

import java.sql.Array;
import java.util.Arrays;

public class Player {
     
    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int tryNumber = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        tryNumber++;
        this.number = number;
        numbers[tryNumber - 1] = number;
    }

    public int getNumber() {
        return number;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void resetArray() {
        Arrays.fill(numbers, 0, tryNumber - 1, 0);
    }
}