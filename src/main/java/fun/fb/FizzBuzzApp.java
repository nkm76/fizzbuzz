package fun.fb;

import fun.fb.algo.FizzBuzzSimple;

public class FizzBuzzApp {

    public static void main(String args[]) {
        final FizzBuzzSimple fbSimple = new FizzBuzzSimple(0);
        for (int i = 1; i <= 100; i++) {
            byte index = fbSimple.next();
            System.out.println(fbSimple.translate(index).orElse(String.valueOf(i)));
        }
    }
}
