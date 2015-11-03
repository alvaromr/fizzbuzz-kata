package main;

public class BuzzMatcher extends Matcher {
    @Override
    public boolean matches(int number) {
        return super.isDivisible(number, 5) || super.containsDigit(number, 5);
    }

    @Override
    public String appendTransformation(int number) {
        return "Buzz";
    }
}
