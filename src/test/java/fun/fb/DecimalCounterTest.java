package fun.fb;

import org.junit.Assert;
import org.junit.Test;

public class DecimalCounterTest {

    @Test(expected = RuntimeException.class)
    public void testRuntimeExceptionOnNegativeIntegers() {
        final DecimalCounter counter = new DecimalCounter(-1);
    }

    @Test(expected = RuntimeException.class)
    public void testRuntimeExceptionOnOverflow() {
        final DecimalCounter counter = new DecimalCounter(99999999);
        counter.increment();
    }

    @Test
    public void testIncrement() {
        final DecimalCounter counter = new DecimalCounter();
        for (int i = 1; i < 100; i++) {
            counter.increment();
            Assert.assertEquals(Integer.valueOf(i), Integer.valueOf(counter.toString()));
        }
    }

    @Test
    public void testIncrementReturn0() {
        final DecimalCounter counter = new DecimalCounter();
        Assert.assertEquals(0, counter.increment());
    }

    @Test
    public void testIncrement9ReturnsTensLocation() {
        final DecimalCounter counter = new DecimalCounter(9);
        Assert.assertEquals(1, counter.increment());
    }

    @Test
    public void testIncrement81ReturnsUnitsLocation() {
        final DecimalCounter counter = new DecimalCounter(81);
        Assert.assertEquals(Integer.valueOf(81), Integer.valueOf(counter.toString()));
        Assert.assertEquals(0, counter.increment());
    }

    @Test
    public void testIncrement99ReturnsHundredsLocation() {
        final DecimalCounter counter = new DecimalCounter(99);
        Assert.assertEquals(2, counter.increment());
    }
}
