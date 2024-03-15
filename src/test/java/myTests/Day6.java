package myTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day6 {
    @Parameters({"URL", "apiKey"})
    @Test
    public void testOneDay6(String urlName, String key) {
        System.out.println("testOneDay6 " + urlName);
        System.out.println(key);
    }

    @Test(dataProvider = "getData")
    public void testTwoDay6(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "username1";
        data[0][1] = "password1";

        data[1][0] = "username2";
        data[1][1] = "password2";

        data[2][0] = "username3";
        data[2][1] = "password3";

        return data;
    }
}
