package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.login.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {
    WebDriver driver;
    LoginPage login;

    void setupDriver() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        setupDriver();
        String url = "https://dev.mwcc.masmoendigital.store/login";
        driver.get(url);
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() throws InterruptedException {
        login = new LoginPage(driver);
        login.putEmail("admin@mail.com");
        login.putPassword("11111111");
        login.clickSubmit();
    }

    @Then("the user is redirected to the dashboard page")
    public void the_user_is_redirected_to_the_dashboard_page() throws InterruptedException {
        String expectedURL = "https://dev.mwcc.masmoendigital.store/admin/dashboard";
        String actualURL = login.getDriver().getCurrentUrl();
        assertEquals(expectedURL, actualURL);
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}