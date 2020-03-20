package fun.fb;

import fun.fb.algo.FizzBuzzWithDigitCheck;

public class FizzBuzzWithDigitCheckApp {

    public static void main(String args[]) {
        final FizzBuzzWithDigitCheck fizzBuzzWithDigitCheck = new FizzBuzzWithDigitCheck();
        for (int i = 1; i <= 100; i++) {
            byte index = fizzBuzzWithDigitCheck.next();
            System.out.println(fizzBuzzWithDigitCheck.translate(index).orElse(String.valueOf(i)));
        }
    }
}
