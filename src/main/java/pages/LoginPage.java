package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends  BasePage {
    //Locators
    private final By usernameField = By.xpath("//*[contains(@name,'username')]");
    private final By passwordField = By.xpath("//*[contains(@name,'password')]");
    private final By loginButton = By.xpath("//*[contains(@type,'submit')]");

    //Methods
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private void setUsername(String username) {
        type(username, usernameField);
    }
    private void setPassword(String password) {
        type(password, passwordField);
    }
    public void login(String userName, String password) {
        setUsername(userName);
        setPassword(password);
        click(loginButton);
    }
}