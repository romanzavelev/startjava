public class GuessNumber {   
    public static void main(String[] args) {
        int randomNumber = 3;
        int enteredNumber = 0;
        while(enteredNumber != randomNumber) { 
            if (enteredNumber > randomNumber) {
                 System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                 System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
            enteredNumber++;
        } 
        System.out.println("Вы угадали!");
    }
}