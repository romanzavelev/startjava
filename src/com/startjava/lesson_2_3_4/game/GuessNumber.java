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
        Scanner scan = new Scanner(System.in);
        while(true) { 
            System.out.println(player1.getName());
            System.out.println("Введите число: ");
            player1.setNumber(scan.nextInt());
            if (player1.getNumber() > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player1.getNumber() < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Победа!!! Угадал игрок:");
                System.out.println(player1.getName());
                break;
            }
            
            System.out.println(player2.getName());
            System.out.println("Введите число: ");
            player2.setNumber(scan.nextInt());
            if (player2.getNumber() > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player2.getNumber() < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Победа!!! Угадал игрок:");
                System.out.println(player2.getName());
                break;
            }
        } 
    }
}