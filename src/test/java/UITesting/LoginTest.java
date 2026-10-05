package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.DoLogin;
import util.OpenBrowser;

public class LoginTest extends OpenBrowser {
    Login login ;

    @BeforeClass
    public void initLogin()
    {
        login =new Login(driver);
    }

    @Test
    public void checkEmailLableVisibility()
    {
        String expected = "Email";
        String actual = login.lblEmail.getText();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"this is not an email label");
    }
}
