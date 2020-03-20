package fun.fb;

import fun.fb.algo.FizzBuzzSimple;

public class FizzBuzzApp {

    private static final String[] TRANSLATE = {"None", "Fizz", "Buzz", "FizzBuzz"};

    public static void main(String args[]) {
        final FizzBuzzSimple fbSimple = new FizzBuzzSimple(0);
        for (int i = 1; i <= 100; i++) {
            byte index = fbSimple.next();
            System.out.println(i + ": " + (index == 0 ? i : TRANSLATE[index]));
//            System.out.println(index == 0 ? i : TRANSLATE[index]);
        }
    }
}
