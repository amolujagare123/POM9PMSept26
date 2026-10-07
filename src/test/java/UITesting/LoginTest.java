package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.DoLogin;
import util.OpenBrowser;

import static util.UIUtility.*;

public class LoginTest extends OpenBrowser {
    Login login ;

    @BeforeClass
    public void initLogin()
    {
        login =new Login(driver);
    }

    /*@Test
    public void txtUsernameVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = false;
        try {
             actual = login.txtUsername.isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertEquals(actual,expected,"username textbox is not present");

    }*/


    @Test
    public void txtUsernameVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = visibilityCheck(login.txtUsername);
        Assert.assertEquals(actual,expected,"username textbox is not present");

    }

    @Test
    public void txtPasswordVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = visibilityCheck(login.txtPassword);
        Assert.assertEquals(actual,expected,"password textbox is not present");

    }


    @Test
    public void checkEmailLabelSpellCheck()
    {
        String expected = "Email";
        String actual = spellCheck(login.lblEmail);

        Assert.assertEquals(actual,expected,"this is not an email label");
    }

    @Test
    public void checkPasswordLabelSpellCheck()
    {
        String expected = "Password";
        String actual = spellCheck(login.lblPassword);

        Assert.assertEquals(actual,expected,"this is not a Password label");
    }
    @Test
    public void txtUsernameWatermarkCheck()
    {
        String expected = "Email";
        String actual = watermarkCheck(login.txtUsername);

        Assert.assertEquals(actual,expected,"incorrect Watermark");
    }

    @Test
    public void txtPasswordWatermarkCheck()
    {
        String expected = "Password";
        String actual = watermarkCheck(login.txtPassword);
        Assert.assertEquals(actual,expected,"incorrect Watermark");
    }

    @Test
    public void checkEmailLabelFontSizeCheck()
    {
        String expected = "14px";
        String actual = styleCheck(login.lblEmail,"font-size");
        Assert.assertEquals(actual,expected,"this is not correct font-size");
    }

    @Test
    public void checkEmailLabelFontFamilyCheck()
    {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = styleCheck(login.lblEmail,"font-family");
        Assert.assertEquals(actual,expected,"this is not correct font-family");
    }


    @Test
    public void btnColorTest()
    {
        String expected = "#2C8EDD";
        String myColor = styleCheck(login.btnLogin,"background-color");
        String actual = rgbToHex(myColor);
        Assert.assertEquals(actual,expected,"this is not correct background-color");

    }

}
