package main;

public class WordTransformer implements Transformer {

    private int numberToMatch;
    private String word;

    public WordTransformer(int numberToMatch, String word) {
        this.numberToMatch = numberToMatch;
        this.word = word;
    }

    public String transform(String original, int number) {
        if (!this.canTransform(number)) {
            return original;
        }
        return original + this.word;
    }

    private boolean canTransform(int number) {
        return this.isDivisible(number, numberToMatch) || this.containsDigit(number, numberToMatch);
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    private boolean containsDigit(int number, int digit) {
        int currentNumber = number;
        int currentDigit = currentNumber % 10;
        boolean found = false;
        while (currentNumber != 0 && !found) {
            found = currentDigit == digit;
            currentNumber /= 10;
            currentDigit = currentNumber % 10;
        }
        return found;
    }
}
