package myTests;

import org.testng.annotations.Test;

public class Day4 {
    @Test
    public void webLoginCarLoan() {
        System.out.println("webLoginHouseLoan");
    }

    @Test
    public void mobileLoginCarLoan() {
        System.out.println("mobileLoginHouseLoan");
    }

    @Test
    public void apiLoginCarLoan() {
        System.out.println("apiLoginHouseLoan");
    }

    @Test(groups = "Smoke")
    public void smokeTestOneDay4() {
        System.out.print("smokeTestOneDay4");
    }
}
