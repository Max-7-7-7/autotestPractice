package basefunctionality;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.HeaderPage;
import pages.helpers.HeaderHelper;

import static utils.WebDriverFactory.getDriver;

public class BaseTest {

    protected WebDriver driver;
    protected HeaderPage headerPage;
    protected HeaderHelper headerHelper;

    @BeforeSuite(alwaysRun = true)
    public void setUpSuite() {

    }

    @BeforeMethod
    public void baseSetUpMethod() {
        driver = getDriver("CHROME");
        headerPage = new HeaderPage(driver);
        headerHelper = new HeaderHelper(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }


}
