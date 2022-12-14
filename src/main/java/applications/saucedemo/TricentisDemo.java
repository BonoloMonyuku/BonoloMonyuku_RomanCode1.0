package applications.saucedemo;

import Roman.Roman;
import applications.saucedemo.pages.LoginPage;

public class TricentisDemo {

    public LoginPage loginPage;
    public TricentisDemo(Roman roman)
    {
        loginPage = new LoginPage(roman);
    }
}
