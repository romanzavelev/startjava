public class Calculator {   
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        char sign = '+';

        if (sign == '+') {
            System.out.println(x + y);
        } else if (sign == '*') {
            System.out.println(x * y);
        } else if (sign == '/') {
            System.out.println(x / y);
        } else if (sign == '^') {
            int result = x;
            for (int i = 2; i <= y; i++) {
                result *= x;
            }
            System.out.println(result);
        } else if (sign == '%') {
            System.out.println(x % y);
        }  
    }
}
