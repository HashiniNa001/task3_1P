package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest1 {

	@Test
    public void testCase1B() {
        DateUtil date = new DateUtil(1, 6, 1994);
        System.out.println("testCase1B > Initial Date: " + date);
        date.increment();
        System.out.println("Next Date: " + date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testCase2B() {
        DateUtil date = new DateUtil(2, 6, 1994);
        System.out.println("testCase2B > Initial Date: " + date);
        date.increment();
        System.out.println("Next Date: " + date);
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testCase3B() {
        DateUtil date = new DateUtil(15, 6, 2024);
        System.out.println("testCase3B > Initial Date: " + date);
        date.increment();
        System.out.println("Next Date: " + date);
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testCase4B() {
        DateUtil date = new DateUtil(28, 2, 2024);
        System.out.println("testCase4B > Initial Date: " + date);
        date.increment();
        System.out.println("Next Date: " + date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testCase5B() {
        DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("testCase5B > Initial Date: " + date);
        date.increment();
        System.out.println("Next Date: " + date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
}

