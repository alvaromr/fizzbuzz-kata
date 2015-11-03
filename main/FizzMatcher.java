package main;

public class FizzMatcher extends Matcher {

    private static final int NUMBER_TO_MATCH = 3;

    public FizzMatcher() {
        super(NUMBER_TO_MATCH);
    }

    @Override
    public String appendTransformation(int number) {
        return "Fizz";
    }
}
