package main;

public class FizzBuzzer {
    public String generate(int number) {
        if (isDivisible(number, 15)) {
            return "FizzBuzz";
        } else if (isDivisible(number, 3)) {
            return "Fizz";
        } else if (isDivisible(number, 5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor ==0;
    }
}
