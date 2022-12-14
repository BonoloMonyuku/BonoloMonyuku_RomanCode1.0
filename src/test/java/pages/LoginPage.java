package pages;

import Roman.RomanBase;
import applications.saucedemo.TricentisDemo;
import applications.saucedemo.models.Credential;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class LoginPage extends RomanBase {


    @BeforeEach
    public void setup() {
        roman()._driver = roman().selenium.getChromeDriver();

        roman()._driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void TricentisDemo() {
        TricentisDemo app = new TricentisDemo(roman());
        app.loginPage.login(new Credential("ontha@gmail.com", "TSH_010!mav#"));
    }

}

