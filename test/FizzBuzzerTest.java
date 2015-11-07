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
        assertEquals("8", fb.generate(8));
        assertEquals("281", fb.generate(281));
        assertEquals("601", fb.generate(601));
        assertEquals("991", fb.generate(991));
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Fizz", fb.generate(3));
        assertEquals("Fizz", fb.generate(9));
        assertEquals("Fizz", fb.generate(12));
        assertEquals("Fizz", fb.generate(18));
        assertEquals("Fizz", fb.generate(31));
        assertEquals("Fizz", fb.generate(163));
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Buzz", fb.generate(5));
        assertEquals("Buzz", fb.generate(25));
        assertEquals("Buzz", fb.generate(50));
        assertEquals("Buzz", fb.generate(541));
        assertEquals("Buzz", fb.generate(659));
        assertEquals("Buzz", fb.generate(859));
    }

    @Test
    public void shouldReturnWozz() {
        assertEquals("Wozz", fb.generate(7));
        assertEquals("Wozz", fb.generate(71));
        assertEquals("Wozz", fb.generate(17));
        assertEquals("Wozz", fb.generate(17));
        assertEquals("Wozz", fb.generate(787));
        assertEquals("Wozz", fb.generate(878));
    }

    @Test
    public void shouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", fb.generate(15));
        assertEquals("FizzBuzz", fb.generate(30));
        assertEquals("FizzBuzz", fb.generate(53));
        assertEquals("FizzBuzz", fb.generate(45));
        assertEquals("FizzBuzz", fb.generate(51));
        assertEquals("FizzBuzz", fb.generate(135));
    }

    @Test
    public void shouldReturnBuzzWozz() {
        assertEquals("BuzzWozz", fb.generate(70));
        assertEquals("BuzzWozz", fb.generate(140));
        assertEquals("BuzzWozz", fb.generate(280));
        assertEquals("BuzzWozz", fb.generate(518));
        assertEquals("BuzzWozz", fb.generate(740));
        assertEquals("BuzzWozz", fb.generate(751));
    }

    @Test
    public void shouldReturnFizzBuzzWozz() {
        assertEquals("FizzBuzzWozz", fb.generate(75));
        assertEquals("FizzBuzzWozz", fb.generate(75));
        assertEquals("FizzBuzzWozz", fb.generate(375));
        assertEquals("FizzBuzzWozz", fb.generate(570));
        assertEquals("FizzBuzzWozz", fb.generate(730));
        assertEquals("FizzBuzzWozz", fb.generate(750));
    }

}