package main;

public abstract class Matcher {
    public abstract boolean matches(int number);

    public abstract String appendTransformation(int number);

    protected boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    protected boolean containsDigit(int number, int digit) {
        int currentNumber = number;
        int currentDigit = currentNumber % 10;
        boolean found = false;
        while(currentDigit != 0 && !found){
            found = currentDigit == digit;
            currentNumber /= 10;
            currentDigit = currentNumber % 10;
        }
        return found;
    }
}
