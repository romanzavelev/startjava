package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("New game");
            System.out.println("У каждого игрока 10 попыток.");
            System.out.print("Введите имя первого игрока: ");
            String name = scan.nextLine();
            Player player1 = new Player(name);
            System.out.print("Введите имя второго игрока: ");
            name = scan.nextLine();
            Player player2 = new Player(name);
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}