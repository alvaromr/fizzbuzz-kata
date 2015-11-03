package main;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzer {
    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;

    private List<Matcher> matchers;
    public FizzBuzzer() {
        matchers = new ArrayList<>();
        matchers.add(new Matcher(FIZZ_NUMBER, "Fizz"));
        matchers.add(new Matcher(BUZZ_NUMBER, "Buzz"));
    }

    public String generate(int number) {
        String transformedNumber = "";
        for(Matcher matcher : matchers){
            if(matcher.matches(number)){
                transformedNumber += matcher.appendTransformation();
            }
        }
        return transformedNumber.isEmpty() ? String.valueOf(number) : transformedNumber;
    }
}
