import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldReturnFizzIfTheNumberIsDivisibleBy3() {

        final FizzBuzz fizzBuzz = new FizzBuzz();

        final String result = fizzBuzz.print(6);

        assertEquals("Fizz",result);

    }
}
