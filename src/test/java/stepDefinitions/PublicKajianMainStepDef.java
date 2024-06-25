package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.kajian.main.kajian.KajianPage;

import static org.junit.Assert.assertTrue;

public class PublicKajianMainStepDef {

    static WebDriver driver;
    static KajianPage KajianMainPage;

    @BeforeAll
    void setup() {
        try {
            driver = Hooks.getDriver();
            if (KajianMainPage == null) {
                KajianMainPage = new KajianPage(driver);
            }

            Hooks.test.log(Status.INFO, "Setup Driver on PublicKajianMainStepDef");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Setup failed: " + e.getMessage());
        }
    }

    @Given("a web browser is at the MWCC main page")
    public void a_web_browser_is_at_the_mwcc_main_page() {
        try {
            setup();
            String actualURL = KajianMainPage.getURL();
            String containURL = "https://dev.mwcc.masmoendigital.store/";

            assertTrue(actualURL.contains(containURL));

            Hooks.test.log(Status.INFO, "Open browser at MWCC Main Page");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to open browser at MWCC Main Page: " + e.getMessage());
        }
    }

    @When("the users clicks the Kajian on the navigation bar")
    public void theUsersClicksTheKajianOnTheNavigationBar() {
        try {
            KajianMainPage.clickMenuKajian();
            Hooks.test.log(Status.INFO, "Click Kajian on the navigation bar");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to click Kajian on the navigation bar: " + e.getMessage());
        }
    }

    @Then("list of kajian are shown on the result page")
    public void listOfKajianAreShownOnTheResultPage() {
        try {
            assert KajianMainPage.isOnPage();
            Hooks.test.log(Status.PASS, "List of kajian are shown on the result page");
        } catch (AssertionError e) {
            Hooks.test.log(Status.FAIL, "Failed to retrieve list of kajian on the result page: " + e.getMessage());
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "An error occurred: " + e.getMessage());
        }
    }



}
