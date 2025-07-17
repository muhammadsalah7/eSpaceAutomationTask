package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminManagementPage extends BasePage{
    public AdminManagementPage(WebDriver driver)
    {
        super(driver);
    }

    //Locators
    private By userNameField = By.xpath("//div[@class='']//input[contains(@class,'--active')]");
    private By searchButton= By.xpath("//button[@type='submit']");
    private By recordsNumber = By.xpath("//div[contains(@class,'horizontal')]//span");
    private By errorMessage = By.xpath("//div[contains(@class,'oxd-toast--error')]");
    private By userDataTable = By.xpath("//div[contains(@class,'table-body')]");
    private By adminName = By.xpath("//span//p");
    private By userName = By.xpath("//div[contains(@class,'table-body')]//div[2]");
    private By userRole = By.xpath("//div[contains(@class,'table-body')]//div[3]");
    private By status = By.xpath("//div[contains(@class,'table-body')]//div[5]");
    private By employeeName = By.xpath("//div[contains(@class,'table-body')]//div[4]");
    private By deleteButton = By.xpath("//div[contains(@class,'table-body')]//div[6]//button[1]");


    //Methods
    public void search (String username){
        type(username, userNameField);
        click(searchButton);
    }
    public String getAdminName(){
        return find(adminName).getText();
    }
    public String getUserName(){
        return find(userName).getText();
    }
    public String getRole(){
        return find(userRole).getText();
    }
    public String getEmpName(){
        return find(employeeName).getText();
    }
    public String getStatus(){
        return find(status).getText();
    }
    public String getNumberOfRows(){
        return find(recordsNumber).getText();
    }
    public void deleteUser() {
        click(deleteButton);
    }
    public boolean isErrorMessageDisplayed()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return isDisplayed(errorMessage);
    }


    //Wait Methods
    public void waitUntilPageLoad(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
    }
    public void waitUntilTableLoading(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userDataTable));
    }
}
