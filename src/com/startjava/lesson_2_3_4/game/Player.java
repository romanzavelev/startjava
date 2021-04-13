package com.startjava.lesson_2_3_4.game;

public class Player {
     
    private String name;
    private int number;
    private int[] numbers;
    private int tryNumber;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
        numbers[tryNumber] = number;
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