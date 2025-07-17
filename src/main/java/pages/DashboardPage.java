package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage extends BasePage{
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    private By adminButton = By.xpath("//span[text()='Admin']");
    public void navigateToAdminManagementPage(){
        waitDashboardPageLoad();
        click(adminButton);
    }

    public void waitDashboardPageLoad(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(adminButton));
    }
}
