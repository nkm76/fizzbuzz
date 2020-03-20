package fun.fb.algo;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzSimpleTest {


    @Test(expected = RuntimeException.class)
    public void testRuntimeExceptionOnNegativeIntegers() {
        final FizzBuzzSimple fbSimple = new FizzBuzzSimple(-1);
    }

    @Test
    public void testTo15() {
        final FizzBuzzSimple fbSimple = new FizzBuzzSimple(0);
        final byte[] expected = {0, 0, 1, 0, 2, 1, 0, 0, 1, 2, 0, 1, 0, 0, 3};
        final byte[] actual = new byte[15];
        for (int i = 0; i < 15; i++) {
            actual[i] = fbSimple.next();
        }
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFrom8To22() {
        final FizzBuzzSimple fbSimple = new FizzBuzzSimple(7);
        final byte[] expected = {0, 1, 2, 0, 1, 0, 0, 3, 0, 0, 1, 0, 2, 1, 0};
        final byte[] actual = new byte[15];
        for (int i = 0; i < 15; i++) {
            actual[i] = fbSimple.next();
        }
        Assert.assertArrayEquals(expected, actual);
    }

}
