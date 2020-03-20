package fun.fb;

import fun.fb.algo.FizzBuzz;
import fun.fb.algo.FizzBuzzSimple;
import fun.fb.algo.FizzBuzzWithDigitCheck;

public class FizzBuzzAdvancedApp {

    public static void main(String args[]) {
        final FizzBuzz fbSimple = new FizzBuzzSimple();
        final FizzBuzz fbWithDigitCheck = new FizzBuzzWithDigitCheck();
        for (int i = 1; i <= 100; i++) {
            byte index = (byte) (fbSimple.next() | fbWithDigitCheck.next());
            System.out.println(fbSimple.translate(index).orElse(String.valueOf(i)));
        }
    }
}
