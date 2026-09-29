package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;

import java.io.IOException;
import java.time.Duration;

import static util.ForDataProvider.getMyData;

public class AddClientDataProviderTest {

    WebDriver driver;

    @BeforeClass
    public void doLogin()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        Login login = new Login(driver);
        login.setUsername("amolujagare@gmail.com");
        login.setPassword("admin123");
        login.btnLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(dataProvider = "getData")
    public void addClientTest(String clientName,
                              String clientSurname,
                              String language,
                              String streetAddress,
                              String streetAddress2,
                              String city,
                              String state,
                              String zipCode,
                              String country,
                              String phone,
                              String fax,
                              String mobile,
                              String email,
                              String web,
                              String birthDate,
                              String vatId,
                              String taxCode,
                              String expected,
                              String xpathActual)
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setActive(true);
        addClient.setClientName(clientName);
        addClient.setClientSurname(clientSurname);
        addClient.setLanguage(language);
        addClient.setStreetAddress(streetAddress);
        addClient.setStreetAddress2(streetAddress2);
        addClient.setCity(city);
        addClient.setState(state);
        addClient.setZipCode(zipCode);
        addClient.setCountry(country);
        addClient.setPhone(phone);
        addClient.setFax(fax);
        addClient.setMobile(mobile);
        addClient.setEmail(email);
        addClient.setWeb(web);
        addClient.setBirthDate(birthDate);
        addClient.setVatId(vatId);
        addClient.setTaxCode(taxCode);

        addClient.clickSave();


        String actual = "";
        try {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);


        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }

    @AfterClass
    public void closeBrowser()
    {
      //  driver.quit();
    }


    @DataProvider
    Object[][] getData() throws IOException {
        return getMyData("Data/AddClientData.xlsx","AddClient");
    }
}
