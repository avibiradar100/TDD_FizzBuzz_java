public class FizzBuzz {
    public String convert(int number){

        if(isNumberDivisibleBy3(number) && isNumberDivisibleBy5(number))
            return "FizzBuzz";
        if(isNumberDivisibleBy3(number))
            return "Fizz";
        if(isNumberDivisibleBy5(number))
            return "Buzz";
        return Integer.toString(number);
    }

    private static boolean isNumberDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private static boolean isNumberDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
