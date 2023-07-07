import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldReturnFizzIfTheNumberIsDivisibleBy3() {
        //arrange
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //act
        final String result = fizzBuzz.convert(6);
        //assert
        assertEquals("Fizz",result);

    }

    @Test
    void shouldReturnBuzzIfTheNumberIsDivisibleBy5() {
        //arrange
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //act
        final String result = fizzBuzz.convert(10);
        //assert
        assertEquals("Buzz",result);
    }

    @Test
    void shouldReturnFizzBuzzIfTheNumberIsDivisibleBy3And5() {
        //arrange
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //act
        final String result = fizzBuzz.convert(15);
        //assert
        assertEquals("FizzBuzz",result);
    }
}
