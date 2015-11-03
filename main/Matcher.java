package main;

public abstract class Matcher {

    private int numberToMatch;

    public Matcher(int numberToMatch) {
        this.numberToMatch = numberToMatch;
    }

    public boolean matches(int number){
        return this.isDivisible(number, numberToMatch) || this.containsDigit(number, numberToMatch);
    }

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
