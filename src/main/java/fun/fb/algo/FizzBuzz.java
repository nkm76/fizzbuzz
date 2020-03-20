package fun.fb.algo;

import java.util.Optional;

public interface FizzBuzz {

    String[] TRANSLATE = {null, "Fizz", "Buzz", "FizzBuzz"};

    byte next();

    default Optional<String> translate(byte val) {
        return val > 1 && val < 4 ? Optional.of(TRANSLATE[val]) : Optional.empty();
    }

}
