package main;

public interface Matcher {
    boolean matches(int number);
    String appendTransformation(int number);
}
