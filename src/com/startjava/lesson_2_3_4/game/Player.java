package com.startjava.lesson_2_3_4.game;

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
        numbers[tryNumber] = number;
        tryNumber++;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public int getLastNumber() {
        return numbers[tryNumber-1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tryNumber);
    }

    public void clear() {
        Arrays.fill(numbers, 0, tryNumber, 0);
        tryNumber = 0;
    }
}