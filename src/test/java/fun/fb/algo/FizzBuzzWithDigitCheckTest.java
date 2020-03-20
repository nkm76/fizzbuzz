package fun.fb.algo;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWithDigitCheckTest {

    @Test(expected = RuntimeException.class)
    public void testRuntimeExceptionOnNegativeIntegers() {
        final FizzBuzzWithDigitCheck fbWithDigitCheck = new FizzBuzzWithDigitCheck(-1);
    }

    @Test
    public void testTo15() {
        final FizzBuzzWithDigitCheck fbWithDigitCheck = new FizzBuzzWithDigitCheck();
        final byte[] expected = {0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2};
        final byte[] actual = new byte[15];
        for (int i = 0; i < 15; i++) {
            actual[i] = fbWithDigitCheck.next();
        }
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFrom8To22() {
        final FizzBuzzWithDigitCheck fbWithDigitCheck = new FizzBuzzWithDigitCheck(7);
        final byte[] expected = {0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0};
        final byte[] actual = new byte[15];
        for (int i = 0; i < 15; i++) {
            actual[i] = fbWithDigitCheck.next();
        }
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test35() {
        final FizzBuzzWithDigitCheck fbWithDigitCheck = new FizzBuzzWithDigitCheck(34);
        Assert.assertEquals(3, fbWithDigitCheck.next());
    }

    @Test
    public void test350() {
        final FizzBuzzWithDigitCheck fbWithDigitCheck = new FizzBuzzWithDigitCheck(349);
        Assert.assertEquals(3, fbWithDigitCheck.next());
    }

}
