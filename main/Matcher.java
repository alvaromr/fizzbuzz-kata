package main;

public abstract class Matcher {
    public abstract boolean matches(int number);

    public abstract String appendTransformation(int number);

    protected boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
