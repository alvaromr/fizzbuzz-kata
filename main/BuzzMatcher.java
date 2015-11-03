package main;

public class BuzzMatcher extends Matcher {

    private static final int NUMBER_TO_MATCH = 5;

    public BuzzMatcher() {
        super(NUMBER_TO_MATCH);
    }

    @Override
    public String appendTransformation(int number) {
        return "Buzz";
    }
}
