package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5 {
    @Test
    public void bDay5() {
        System.out.println("bDay5");
    }

    @Test
    public void aDay5() {
        System.out.println("aDay5");
    }

    @Test
    public void cDay5() {
        System.out.println("cDay5");
    }

    @Test(groups = "Smoke")
    public void smokeTestOneDay5() {
//        Assert.fail();
        System.out.print("smokeTestOneDay5");
    }
}
