package fun.fb;

public class DecimalCounter {

    // Starting with 8 digits but this can be changed
    // Theoretical limit of number of decimal digits is 2^31 - 1 (max array size on java)
    private final byte[] decimalCounter = new byte[8];

    /**
     * Default starts at 0
     */
    public DecimalCounter() {
        this(0);
    }

    public DecimalCounter(int start) {
        if (start < 0) {
            throw new RuntimeException("Only whole numbers allowed (0, 1, 2, 3...)");
        }
        int i = 0;
        do {
            decimalCounter[i++] = (byte) (start % 10);
        } while ((start = start / 10) != 0);
    }

    /**
     * Returns the index of the most significant digit incremented
     * This is to optimise the checks that need to be done to identify FIZZ/BUZZ
     *
     * @return
     */
    public int increment() {
        for (int i = 0; i < decimalCounter.length; i++) {
            if (decimalCounter[i] == 9) {
                decimalCounter[i] = 0;
            } else {
                decimalCounter[i] = ++decimalCounter[i];
                return i;
            }
        }
        throw new RuntimeException("Overflow! Please increase the array length of decimalCounter");
    }

    /**
     * Returns the digit at the specified index
     *
     * @param index
     * @return
     */
    public byte get(int index) {
        return decimalCounter[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = decimalCounter.length - 1; i >= 0; --i) {
            sb.append(decimalCounter[i]);
        }
        return sb.toString();
    }
}
