package learning.junit;

import org.junit.Assert;
import org.junit.Test;

public class MySimpleMathTest {
    
	@Test
    public void testCheckSignShouldReturnPositive() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals("positive", sm.checkSign(5));
        Assert.assertEquals("positive", sm.checkSign(0));
    }
    
    @Test
    public void testCheckSignShouldReturnNegative() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals("negative", sm.checkSign(-5));
    }
    
    @Test
    public void testDivisionShouldReturnPositiveQuotient() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals(2.0, sm.divide(10, 5), 0);
        Assert.assertEquals(0.0, sm.divide(0, 5), 0);
    }
    
    @Test
    public void testDivisionShouldReturnNegativeQuotient() {
        MySimpleMath sm = new MySimpleMath();
        Assert.assertEquals(-2.0, sm.divide(10, -5), 0);
    }
    
    @Test (expected = ArithmeticException.class)
    public void testDivisionShouldThrowArithmeticException() {
        MySimpleMath sm = new MySimpleMath();
        sm.divide(10, 0);
    }
    
} //180250635101695