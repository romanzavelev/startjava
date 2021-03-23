public class Calculator {   
    public static int calculate(int x, char sign, int y) {
        switch (sign) {
            case '+':
                return x + y;
            case '*':
                return (x * y);
            case '/':
                return (x / y);
            case '^':
                int result = x;
                for (int i = 2; i <= y; i++) {
                result *= x;
                }
                return result;
            default:
                return (x % y);
        } 
    }
}
