
import org.junit.Assert;
import org.junit.Test;

public class ArraysAreEqualTest {
    ArraysAreEqual aae = new ArraysAreEqual();

    /**
     * {0,1,2,3,4} is equal to {0,1,2,3,4}, so equal should return true.
     */
    @Test
    public void equalTest1(){
        int[] input1 = {0,1,2,3,4};
        int[] input2 = {0,1,2,3,4};
        boolean expected = true;
        boolean actual = aae.equal(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    /**
     * {4,4,4,4,4} is not equal to {0,1,2,3,4}, so equal should return false.
     */
    @Test
    public void equalTest2(){
        int[] input1 = {4,4,4,4,4};
        int[] input2 = {0,1,2,3,4};
        boolean expected = false;
        boolean actual = aae.equal(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * {0,1,2,3,5} is not equal to {0,1,2,3,4}, so equal should return false.
     */
    @Test
    public void equalTest3(){
        int[] input1 = {0,1,2,3,5};
        int[] input2 = {0,1,2,3,4};
        boolean expected = false;
        boolean actual = aae.equal(input1, input2);
        Assert.assertEquals(expected, actual);
    }
}

