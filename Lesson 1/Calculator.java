public class Calculator {   
    public static void main(String[] args) {
        int x;
        int y;
        char sign;

        x = 5;
        y = 6;
        sign = '+';
        if (sign == '+') {
            System.out.println(x+y);
        }

        x = 2;
        y = 3;
        sign = '*';
        if (sign == '*') {
            System.out.println(x*y);
        }

        x = 6;
        y = 3;
        sign = '/';
        if (sign == '/') {
            System.out.println(x/y);
        }

        x = 2;
        y = 3;
        sign = '^';
        if (sign == '^') {
            int sum = x;
            for (int i = 2; i <= y; i++) {
                sum = sum * x;
            }
            System.out.println(sum);
        }

        x = 10;
        y = 4;
        sign = '%';
        if (sign == '%') {
            System.out.println(x%y);
        }  
    }
}
