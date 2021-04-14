package com.startjava.lesson_2_3_4.game;

public class Player {
     
    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int tryNumber = 1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
        numbers[tryNumber - 1] = number;
        tryNumber++;
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
}