package fun.fb.algo;

import fun.fb.DecimalCounter;

public class FizzBuzzWithDigitCheck {

    private final DecimalCounter decimalCounter;
    private int currentMax3Index = -1;
    private int currentMax5Index = -1;

    public FizzBuzzWithDigitCheck() {
        decimalCounter = new DecimalCounter();
    }

    public FizzBuzzWithDigitCheck(int start) {
        decimalCounter = new DecimalCounter(start);
        int i = 0;
        do {
            if (start % 10 == 3) {
                currentMax3Index = i;
            } else if (start % 10 == 5) {
                currentMax5Index = i;
            }
            ++i;
        } while ((start = start / 10) != 0);
    }

    public byte next() {
        int i = decimalCounter.increment();
        byte fizzType = 0;
        if (currentMax3Index > i) {
            fizzType = 1;
        } else {
            if (decimalCounter.get(i) == 3) {
                currentMax3Index = i;
                fizzType = 1;
            } else {
                // Reset
                currentMax3Index = -1;
            }
        }
        byte buzzType = 0;
        if (currentMax5Index > i) {
            buzzType = 2;
        } else {
            if (decimalCounter.get(i) == 5) {
                currentMax5Index = i;
                buzzType = 2;
            } else {
                // Reset
                currentMax5Index = -1;
            }
        }
        return (byte) (fizzType | buzzType);
    }

}
