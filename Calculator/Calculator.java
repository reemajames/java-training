package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operator) {
            case '+':
                result = calculate(num1, num2, (a, b) -> a + b);
                break;
            case '-':
                result = calculate(num1, num2, (a, b) -> a - b);
                break;
            case '*':
                result = calculate(num1, num2, (a, b) -> a * b);
                break;
            case '/':
                result = calculate(num1, num2, (a, b) -> a / b);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
    interface Operation {
        double apply(double a, double b);
    }
    public static double calculate(double a, double b, Operation operation) {
        return operation.apply(a, b);
    }
}
