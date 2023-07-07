public class FizzBuzz {
    public String print(int i){

        if(i%3==0 && i%5 !=0)
            return "Fizz";
        if(i%5==0 && i%3!=0)
            return "Buzz";
        return "FizzBuzz";
    }
}
