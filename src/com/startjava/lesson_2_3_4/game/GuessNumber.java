package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
            if (EnterNumbers(player1)) {
                finishGame();
                break;
            }

            if (EnterNumbers(player2)) {
                finishGame();
                break;
            }
        }
    }

    private int GetActualNumber(Player player) {
        return player.getNumbers()[player.getTryNumber() - 1];
    }

    private boolean EnterNumbers(Player player) {
        System.out.println(player.getName());
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        player.setNumber(scan.nextInt());
        if (GetActualNumber(player) > randomNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (GetActualNumber(player) < randomNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + GetActualNumber(player) +
                    " с " + player.getTryNumber() + " попытки");
            return true;
        }

        if (player.getTryNumber() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void finishGame() {
        int[] arrayTryPlayer1 = Arrays.copyOf(player1.getNumbers(), player1.getTryNumber());
        System.out.println("Попытки игрока " + player1.getName());
        outputArray(arrayTryPlayer1);
        int[] arrayTryPlayer2 = Arrays.copyOf(player2.getNumbers(), player2.getTryNumber());
        System.out.println("Попытки игрока " + player2.getName());
        outputArray(arrayTryPlayer2);
        player1.clear();
        player2.clear();
    }

    private void outputArray(int[] arrayTryPlayer) {
        for (int actualValue:arrayTryPlayer) {
            System.out.print(actualValue + " ");
        }
        System.out.println();
    }
}