package main;

public class WordTransformer implements Transformer {

    private final Word WORD;

    public WordTransformer(Word word) {
        this.WORD = word;
    }

    public String transform(String original, int number) {
        if (!this.canTransform(number)) {
            return original;
        }
        return original + this.WORD.toString();
    }

    private boolean canTransform(int number) {
        return this.isDivisible(number, this.WORD.NUMBER) || this.containsDigit(number, this.WORD.NUMBER);
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
