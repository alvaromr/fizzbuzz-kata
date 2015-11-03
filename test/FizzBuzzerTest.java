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
    public void shouldReturnNumber() {
        assertEquals("1", fb.generate(1));
        assertEquals("2", fb.generate(2));
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Fizz", fb.generate(3));
        assertEquals("Fizz", fb.generate(9));
        assertEquals("Fizz", fb.generate(31));
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Buzz", fb.generate(5));
        assertEquals("Buzz", fb.generate(25));
        assertEquals("Buzz", fb.generate(35));
        assertEquals("Buzz", fb.generate(56));
    }

    @Test
    public void shouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fb.generate(15));
        assertEquals("FizzBuzz", fb.generate(30));
        assertEquals("FizzBuzz", fb.generate(45));
        assertEquals("FizzBuzz", fb.generate(51));

    }

}