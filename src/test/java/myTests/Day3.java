package myTests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeSuite
    public void aBeforeSuite(){
        System.out.println("aBefore Suite");
    }

    @Parameters("URL")
    @Test
    public void webLoginCarLoan(String urlName) {
        System.out.println("webLoginCarLoan " + urlName);
    }

    @Test(timeOut =4000)
    public void mobileLoginCarLoan() {
        System.out.println("mobileLoginCarLoan");
    }

    @Test(dependsOnMethods = {"apiLoginCarLoanSignOut", "webLoginCarLoan"})
    public void apiLoginCarLoanSignIn() {
        System.out.println("apiLoginCarLoanSignIn");
    }

    @Test
    public void apiLoginCarLoanSignOut() {
        System.out.println("apiLoginCarLoanSignOut");
    }

    @Test(groups = "Smoke", enabled = false)
    public void smokeTestOneDay3() {
        System.out.print("smokeTestOneDay3");
    }
}
