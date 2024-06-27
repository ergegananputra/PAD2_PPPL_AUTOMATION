package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeAll
    static void setupDriver() {
        extent = ExtentReportManager.getInstance();
        if (driver != null) {
            return;
        }
        driver = new EdgeDriver();
        // D:\Download Program\edgedriver_win64
//        System.setProperty("webdriver.edge.driver", "D:\\Download Program\\edgedriver_win64\\msedgedriver.exe");

        driver.manage().window().maximize();
        test = extent.createTest("PPPL Testing PAD2");
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setupDriver();
        }
        return driver;
    }

    public static WebDriver resetDriver() {
        if (driver != null) {
            driver.quit();
        }
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @AfterAll
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }

        test.log(Status.INFO, "Close browser");

        extent.flush();
    }


}
