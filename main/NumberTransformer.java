package main;

public class NumberTransformer implements Transformer {
    @Override
    public String transform(String original, int number) {
        if (!original.isEmpty()) {
            return original;
        }
        return String.valueOf(number);
    }
}
