package main;

public class BuzzMatcher implements Matcher{
    @Override
    public boolean matches(int number) {
        return number % 5 == 0;
    }

    @Override
    public String appendTransformation(int number) {
        return "Buzz";
    }
}
