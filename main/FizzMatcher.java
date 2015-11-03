package main;

public class FizzMatcher extends Matcher {
    @Override
    public boolean matches(int number) {
        return super.isDivisible(number, 3) || super.containsDigit(number, 3);
    }

    @Override
    public String appendTransformation(int number) {
        return "Fizz";
    }
}
