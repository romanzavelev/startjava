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
        Scanner scan = new Scanner(System.in);
        while (true) {
            EnterNumbers(player1);

            System.out.println(player2.getName());
            System.out.println("Введите число: ");
            player2.setNumber(scan.nextInt());
            if (player2.getNumber() > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player2.getNumber() < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() +
                        " с " + player2.getTryNumber() + " попытки");
                endGame();
                break;
            }
            if (player1.getTryNumber() == 10) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
                endGame();
                break;
            }
            if (player2.getTryNumber() == 10) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                endGame();
                break;
            }
        }
    }

    private boolean EnterNumbers(Player player) {
        System.out.println(player.getName());
        System.out.println("Введите число: ");
        player.setNumber(scan.nextInt());
        if (player.getNumber() > randomNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (player.getNumber() < randomNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() +
                    " с " + player.getTryNumber() + " попытки");
            return true;
        }
        return false;
    }

    private void endGame() {
        int[] arrayTryPlayer1 = Arrays.copyOf(player1.getNumbers(), player1.getTryNumber());
        System.out.println(Arrays.toString(arrayTryPlayer1));
        int[] arrayTryPlayer2 = Arrays.copyOf(player2.getNumbers(), player2.getTryNumber());
        System.out.println(Arrays.toString(arrayTryPlayer2));
        player1.clear();
        player2.clear();
    }
}