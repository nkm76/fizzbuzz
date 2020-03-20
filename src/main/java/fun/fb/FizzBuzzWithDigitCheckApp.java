package fun.fb;

import fun.fb.algo.FizzBuzzWithDigitCheck;

public class FizzBuzzWithDigitCheckApp {

    private static final String[] TRANSLATE = {"NONE", "Fizz", "Buzz", "FizzBuzz"};

    public static void main(String args[]) {
        final FizzBuzzWithDigitCheck fizzBuzzWithDigitCheck = new FizzBuzzWithDigitCheck(0);
        for (int i = 1; i <= 100; i++) {
            byte index = fizzBuzzWithDigitCheck.next();
            System.out.println(i + ": " + (index == 0 ? i : TRANSLATE[index]));
//            System.out.println(index == 0 ? i : TRANSLATE[index]);
        }
    }
}
