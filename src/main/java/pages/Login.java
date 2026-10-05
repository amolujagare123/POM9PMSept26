package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v151.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

   /* WebDriver driver;
    WebElement element = driver.findElement(By.xpath(""));*/

    @FindBy(id="email")
    public WebElement txtUsername;

    @FindBy(id="password")
    public WebElement txtPassword;

    @FindBy(xpath = "//button")
    public WebElement btnLogin;

    @FindBy (xpath = "//a[contains(text(),'forgot')]")
    public WebElement forgotPassword;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement lblEmail;

    @FindBy(xpath = "//label[@for='password']")
    public WebElement lblPassword;

    public void clickForgotPassword()
    {
        forgotPassword.click();
    }

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void btnLogin()
    {
        btnLogin.click();
    }
}
