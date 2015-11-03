package main;

public class Matcher {

    private int numberToMatch;
    private String transformation;

    public Matcher(int numberToMatch, String transformation) {
        this.numberToMatch = numberToMatch;
        this.transformation = transformation;
    }

    public boolean matches(int number) {
        return this.isDivisible(number, numberToMatch) || this.containsDigit(number, numberToMatch);
    }

    public String appendTransformation() {
        return this.transformation;
    }

    protected boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    protected boolean containsDigit(int number, int digit) {
        int currentNumber = number;
        int currentDigit = currentNumber % 10;
        boolean found = false;
        while (currentDigit != 0 && !found) {
            found = currentDigit == digit;
            currentNumber /= 10;
            currentDigit = currentNumber % 10;
        }
        return found;
    }
}
