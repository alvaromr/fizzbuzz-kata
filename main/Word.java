package main;

public enum Word {
    Fizz(3),
    Buzz(5),
    Wozz(7);

    public final int NUMBER;

    Word(int number) {
        this.NUMBER = number;
    }
}
