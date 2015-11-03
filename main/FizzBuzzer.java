package main;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzer {
    private List<Matcher> matchers;
    public FizzBuzzer() {
        matchers = new ArrayList<>();
        matchers.add(new FizzMatcher());
        matchers.add(new BuzzMatcher());
    }

    public String generate(int number) {
        String transformedNumber = "";
        for(Matcher matcher : matchers){
            if(matcher.matches(number)){
                transformedNumber += matcher.appendTransformation(number);
            }
        }
        return transformedNumber.isEmpty() ? String.valueOf(number) : transformedNumber;
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
