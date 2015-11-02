package test;

import main.FizzBuzzer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzerTest {

    private FizzBuzzer fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzzer();
    }

    @Test
    public void shouldReturnOne() {
        assertEquals("1", fb.generate(1));
    }

    @Test
    public void shouldReturnTwo() {
        assertEquals("2", fb.generate(2));
    }
}