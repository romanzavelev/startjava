import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int x = scan.nextInt();
            System.out.print("Введите знак математической операции: ");
            char sign = scan.next().charAt(0);
            System.out.print("Введите второе число: ");
            int y = scan.nextInt();
            scan.nextLine();
            System.out.println(Calculator.calculate(x,sign,y));
            answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
            }
        }
    }
}