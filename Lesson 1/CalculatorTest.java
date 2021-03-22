import java.util.Scanner;
public class CalculatorTest {   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        start:
        System.out.print("Введите первое число: ");
        int x = scan.nextInt();
        System.out.print("Введите знак математической операции: ");
        char sign = scan.next().charAt(0);
        System.out.print("Введите второе число: ");
        int y = scan.nextInt();
        System.out.println(Calculator.math(x,sign,y));
        String answer = "";
        while ((answer != "да") && (answer != "нет")) {
            System.out.print("Хотите продолжить вычисления? [да/нет]:");
            answer = scan.nextLine();
        }
        if (answer == "да") {
            return start;
        }
    }
}