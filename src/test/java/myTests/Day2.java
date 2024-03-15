package myTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @Test
    public void testDay2() {
        System.out.println("TestDay2");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @Test(groups = "Smoke")
    public void smokeTestOneDay2() {
        System.out.print("smokeTestOneDay2");
    }
}
