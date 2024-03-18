package InterestCalculator;

public class CompoundInterest {
    public double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }
}
