public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i<=20 ; i++ ) {
            System.out.println(i);
        }

        int x = 6;
        while (x >= -6) {
            System.out.println(x);
            x = x - 2;
        }

        int y = 10;
        int sum = 0;
        do {
            if (y % 2 != 0) {
                sum = sum + y;
            }
            y++;
        } while (y<20);
        System.out.println(sum);
    }
}