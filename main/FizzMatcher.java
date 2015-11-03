package main;

public class FizzMatcher implements Matcher{
    @Override
    public boolean matches(int number) {
        return number % 3 == 0;
    }

    @Override
    public String appendTransformation(int number) {
        return "Fizz";
    }
}
