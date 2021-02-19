public class GuessNumber  {   
    public static void main(String[] args) {
        int x = 3;
        int i = 0;
        while(i != x) { 
            if (i > x) {
                 System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                 System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
            i++;
        } 
        System.out.println("Вы угадали!");
    }
}
