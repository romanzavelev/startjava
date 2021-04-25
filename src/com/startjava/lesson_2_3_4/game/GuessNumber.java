package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        randomNumber = random.nextInt(101);
        while (true) {
            enterNumber(player1);
            if (checkNumbers(player1)) {
                break;
            }

            enterNumber(player2);
            if (checkNumbers(player2)) {
                break;
            }
        }
        outputEnteredNumbers(player1);
        outputEnteredNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " введите число: ");
        Scanner scan = new Scanner(System.in);
        player.setNumber(scan.nextInt());
    }

    private boolean checkNumbers(Player player) {
        if (player.getLastNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getLastNumber() +
                    " с " + player.getTryNumber() + " попытки");
            return true;
        }

        String lessOrMoree = player.getLastNumber() > randomNumber ? "больше" : "меньше";
        System.out.println("Введенное вами число " + lessOrMoree + " того, что загадал компьютер");

        if (player.getTryNumber() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void outputEnteredNumbers(Player player) {
        System.out.println("Попытки игрока " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}