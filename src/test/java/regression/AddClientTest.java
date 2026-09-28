package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;

public class AddClientTest {

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
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setActive(true);
        addClient.setClientName("Rahul");
        addClient.setClientSurname("Sharma");

        addClient.setStreetAddress("12, MG Road");
        addClient.setStreetAddress2("Near City Mall");
        addClient.setCity("Pune");
        addClient.setState("Maharashtra");
        addClient.setZipCode("411001");

        addClient.setPhone("02012345678");
        addClient.setFax("02087654321");
        addClient.setMobile("9876543210");
        addClient.setEmail("rahul.sharma@gmail.com");
        addClient.setWeb("www.rahulsharma.com");
        addClient.setBirthDate("25-Mar-2027");

        // 25-Mar-2027

        addClient.setVatId("VAT12345");
        addClient.setTaxCode("TAX6789");

        //addClient.clickSave();
    }

    @AfterClass
    public void closeBrowser()
    {
      //  driver.quit();
    }
}
