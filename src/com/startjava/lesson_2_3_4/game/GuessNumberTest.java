package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("New game");
        System.out.println("У каждого игрока 10 попыток.");
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        String answer;

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}