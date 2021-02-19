public class Calculator {   
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        char sign = '+';
        
        if (sign == '+') {
            System.out.println(x+y);
        } else if (sign == '*') {
            System.out.println(x*y);
        } else if (sign == '/') {
            System.out.println(x/y);
        } else if (sign == '^') {
            int sum = x;
            for (int i = 2; i <= y; i++) {
                sum = sum * x;
            }
            System.out.println(sum);
        } else if (sign == '%') {
            System.out.println(x%y);
        }  
    }
}
