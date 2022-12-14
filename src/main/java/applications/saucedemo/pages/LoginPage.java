package applications.saucedemo.pages;

import Roman.Roman;
import applications.saucedemo.models.Credential;
import org.openqa.selenium.By;
import applications.xyzBank.selenium.AbstractBankingPage;

public class LoginPage extends AbstractBankingPage {


    private By loginTextLink = By.xpath("//a[contains(@href,'/login')]");
    private By username = By.id("Email");
    private By password = By.id("Password");
    private By loginBtn = By.xpath(".//input[@class='button-1 login-button']");

    public LoginPage(Roman roman)
    {
        super(roman);
    }

    public void login(Credential credential)
    {
        navigateTo();
        click(loginTextLink);
        sendKeys(username, credential.username);
        sendKeys(password, credential.password);
        click(loginBtn);
    }

    @Override
    protected String get_uri() {
        return "https://demowebshop.tricentis.com/login";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }
}
