package main;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzer {
    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;
    public static final int WOZZ_NUMBER = 7;

    private List<Transformer> transformers;

    public FizzBuzzer() {
        transformers = new ArrayList<>();
        transformers.add(new WordTransformer(FIZZ_NUMBER, "Fizz"));
        transformers.add(new WordTransformer(BUZZ_NUMBER, "Buzz"));
        transformers.add(new WordTransformer(WOZZ_NUMBER, "Wozz"));
        transformers.add(new NumberTransformer());
    }

    public String generate(int number) {
        String transformedNumber = "";
        for (Transformer transformer : transformers) {
            transformedNumber = transformer.transform(transformedNumber, number);
        }
        return transformedNumber;
    }
}
