package main;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzer {
    private final List<Transformer> transformers;

    public FizzBuzzer() {
        transformers = new ArrayList<>();
        transformers.add(new WordTransformer(Word.Fizz));
        transformers.add(new WordTransformer(Word.Buzz));
        transformers.add(new WordTransformer(Word.Wozz));
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
