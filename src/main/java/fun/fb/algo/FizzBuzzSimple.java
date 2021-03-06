package fun.fb.algo;

/**
 * This can run forever without any overflow
 */
public class FizzBuzzSimple implements FizzBuzz {

    // Keeping a bit map for FIZZ = 2^0  , BUZZ 2^1
    // Repeating pattern for FIZZ BUZZ
    private final byte[] fbPattern = {0, 0, 1, 0, 2, 1, 0, 0, 1, 2, 0, 1, 0, 0, 3};
    // Using Atomic integer for thread safe invocation
//    private final AtomicInteger counter;
    private int counter;

    /**
     * Default starts at 0
     */
    public FizzBuzzSimple() {
        this(0);
    }

    /**
     * Useful for testing to initialise for specific test case
     *
     * @param start
     */
    public FizzBuzzSimple(int start) {
        if (start < 0) {
            throw new RuntimeException("Only natural numbers allowed (0, 1, 2,...)");
        }
//        counter = new AtomicInteger((start) % 15);
        counter = start % 15;
    }

    @Override
    public byte next() {
//        return fbPattern[counter.getAndUpdate((i) -> i == 14 ? 0 : i + 1)];
        byte ret = fbPattern[counter];
        counter = counter == 14 ? 0 : counter + 1;
        return ret;
    }
}
