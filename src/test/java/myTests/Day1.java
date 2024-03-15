package myTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {
    @Test
    public void testOneDay1() {
        System.out.println("TestOneDay1");
    }

    @Test
    public void testTwoDay1() {
        System.out.println("TestTwoDay1");
    }

    @Test
    public void testTwoDay3() {
        System.out.println("TestThreeDay1");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method in Day1");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }

    @Test(groups = "Smoke")
    public void smokeTestOneDay1() {
        System.out.print("smokeTestOneDay1");
    }
}
