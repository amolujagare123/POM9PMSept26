package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.Login;

public class DoLogin extends OpenBrowser {



       @BeforeClass
        public void doLogin()
        {


            Login login = new Login(driver);
            login.setUsername("amolujagare@gmail.com");
            login.setPassword("admin123");
            login.btnLogin();
        }


}
