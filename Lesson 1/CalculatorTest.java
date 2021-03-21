import java.util.*;
public class CalculatorTest {   
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Calculator calc = new Calculator();
            System.out.print("Введите первое число: ");
            int x = scan.nextInt();
             System.out.print("Введите знак математической операции: ");
            char sign = scan.next().charAt(0);
            System.out.print("Введите второе число: ");
            int y = scan.nextInt();
            //int result = Calculator.math(x,sign,y);
            System.out.println(Calculator.math(x,sign,y));
    }
}