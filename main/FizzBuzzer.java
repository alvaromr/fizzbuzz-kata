package main;

public class FizzBuzzer {
    public String generate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
