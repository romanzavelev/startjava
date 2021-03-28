import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Player player1;
    Player player2;
    int randomNumber;
    int enteredNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void StartGame() {
        Random random = new Random();
        randomNumber = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int playerNumber = 1;
        Player currentPlayer;
        while(enteredNumber != randomNumber) { 
            if (playerNumber % 2 == 1) {
                currentPlayer = player1;
            } else {
                currentPlayer = player2;
            }
            System.out.println(currentPlayer);
            System.out.println("Введите число: ");
            currentPlayer.setNumber(scan.nextInt());
            if (currentPlayer.getNumber() > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Победа!!! Угадал игрок:");
                System.out.println(currentPlayer);
                break;
            }
            playerNumber++;
        } 
    }
}