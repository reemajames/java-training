package InterestCalculator;

import java.util.*;

public class InterestCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter Time Period (in years): ");
        double time = scanner.nextDouble();

        SimpleInterest simpleInterestCalculator = new SimpleInterest();
        double simpleInterest = simpleInterestCalculator.calculateSimpleInterest(principal, rate, time);
        CompoundInterest compoundInterestCalculator = new CompoundInterest();
        double compoundInterest = compoundInterestCalculator.calculateCompoundInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
        scanner.close();
    }
}
