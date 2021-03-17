public class Calculator {   
    public int math(int x, char sign, int y) {
        switch (sign) {
            case ('+'):
            return (x + y);
            brake;
            case ('*'):
            return (x * y);
            brake;
            case ('/'):
            return (x / y);
            brake;
            case ('^'):
             int result = x;
            for (int i = 2; i <= y; i++) {
                result *= x;
            }
            return result;
            brake;
            case ('%'):
            return (x % y);
            brake;
        } 
    }
}
