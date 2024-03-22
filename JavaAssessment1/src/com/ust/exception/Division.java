package com.ust.exception;

import java.util.Scanner;

public class Division {

    static class InvalidDivisorException extends Exception {
        public InvalidDivisorException(String message) {
            super(message);
        }
    }

    public static double divideNumbers(double dividend, double divisor) throws InvalidDivisorException {
        double result = 0;
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
            result = dividend / divisor;
        } catch (ArithmeticException e) {
            System.err.println("Error occurred: " + e.getMessage());
            throw new InvalidDivisorException("Please pass a valid divisor");
        } finally {
            System.out.println("Divisor used: " + divisor);
            System.out.println("Dividend used: " + dividend);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();

        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        try {
            double result = divideNumbers(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (InvalidDivisorException e) {
            System.err.println("Error message: " + e.getMessage());
        }
    }
}
