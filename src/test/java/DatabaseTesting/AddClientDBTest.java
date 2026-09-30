package DatabaseTesting;

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
import java.sql.*;
import java.time.Duration;
import java.util.ArrayList;

import static util.Conversion.getCountry;
import static util.ForDataProvider.getMyData;

public class AddClientDBTest {

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
                              String taxCode
                             ) throws ClassNotFoundException, SQLException {
        ArrayList<String> expected = new ArrayList<>();
        expected.add(clientName);
        expected.add(clientSurname);
        expected.add(language.toLowerCase());
        expected.add(streetAddress);
        expected.add(streetAddress2);
        expected.add(city);
        expected.add(state);
        expected.add(zipCode);
        expected.add(country);
        expected.add(phone);
        expected.add(fax);
        expected.add(mobile);
        expected.add(email);
        expected.add(web);
        expected.add(birthDate);
        expected.add(vatId);
        expected.add(taxCode);

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



        // 1. loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection

        String url = "jdbc:mysql://localhost:3306/ip";
        String username = "root";
        String password = "root"; // use your mysql password or blank if you have no password


        Connection con = DriverManager.getConnection(url,username,password);

        // 3. Creating a statement
        Statement st = con.createStatement();

        // 4. Executing query

        String sql = "select * from ip_clients where client_name='"+clientName+"'";
        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList<>();
        while (rs.next())
        {
            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_language"));
            actual.add(rs.getString("client_address_1"));
            actual.add(rs.getString("client_address_2"));
            actual.add(rs.getString("client_city"));
            actual.add(rs.getString("client_state"));
            actual.add(rs.getString("client_zip"));


            String myCountry = getCountry(rs.getString("client_country"));

            actual.add(myCountry);

            actual.add(rs.getString("client_phone"));
            actual.add(rs.getString("client_fax"));
            actual.add(rs.getString("client_mobile"));
            actual.add(rs.getString("client_email"));
            actual.add(rs.getString("client_web"));
            actual.add(rs.getString("client_birthdate"));
            actual.add(rs.getString("client_vat_id"));
            actual.add(rs.getString("client_tax_code"));
        }


        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);


        // Assert.assertEquals(actual,expected,"incorrect or no error message");
    }

    @AfterClass
    public void closeBrowser()
    {
      //  driver.quit();
    }


    @DataProvider
    Object[][] getData() throws IOException {
        return getMyData("Data/AddClientData.xlsx","dbTesting");
    }
}
