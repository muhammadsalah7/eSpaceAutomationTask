package tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminManagementPage;
import pages.DashboardPage;
import pages.LoginPage;

public class AdminUserFlow extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    AdminManagementPage adminPage;
    @BeforeMethod
    public void tstBeforeClass() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        adminPage = new AdminManagementPage(driver);
        loginPage.login("Admin","admin123");
    }

    @Test
    public void validateUserDetailsAndDeletion(){
        dashboardPage.navigateToAdminManagementPage();
        adminPage.waitUntilPageLoad();
        adminPage.search("Admin");
        adminPage.waitUntilTableLoading();
        Assert.assertTrue(adminPage.getNumberOfRows().contains("(1)"));
        Assert.assertEquals(adminPage.getUserName(),"Admin");
        Assert.assertEquals(adminPage.getRole(),"Admin");
        Assert.assertEquals(adminPage.getEmpName(),adminPage.getAdminName());
        Assert.assertEquals(adminPage.getStatus(),"Enabled");
        adminPage.deleteUser();
        Assert.assertTrue(adminPage.isErrorMessageDisplayed());
    }
}
