package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.home.HomePage;
import pages.kajian.main.kajian.KajianPage;

import static org.junit.Assert.assertTrue;

public class PublicKajianReadStepDef {
    static WebDriver driver;
    static KajianPage KajianMainPage;
    static HomePage homePage;

    @BeforeAll
    public static void setup() {
        try {
            driver = Hooks.getDriver();
            if (KajianMainPage == null) {
                KajianMainPage = new KajianPage(driver);
            }
            if (homePage == null) {
                homePage = new HomePage(driver);
            }
            Hooks.test.log(Status.INFO, "Setup Driver on PublicKajianMainStepDef");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Setup failed: " + e.getMessage());
        }
    }

    @Given("a web browser is at the MWCC kajian page")
    public void a_web_browser_is_at_the_mwcc_kajian_page() {
        try {
            setup();
            driver.get("https://dev.mwcc.masmoendigital.store/kajian");
            Hooks.test.log(Status.INFO, "Open browser at MWCC Kajian Page");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to open browser at MWCC Kajian Page: " + e.getMessage());
        }
    }

    @When("the users clicks the Kajian card")
    public void theUsersClicksTheKajianCard() {
        try {
            KajianMainPage.clickKajianItemViewMoreButtonByIndex(0);
            Hooks.test.log(Status.INFO, "Click Kajian card");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to click Kajian card: " + e.getMessage());
        }
    }

    @Then("the users are redirected to the Kajian detail page")
    public void theUsersAreRedirectedToTheKajianDetailPage() {
        try {
            String actualURL = KajianMainPage.getURL();
            System.out.println("Actual URL: " + actualURL);
            String containURL = "https://dev.mwcc.masmoendigital.store/kajian/";
            assert actualURL.contains(containURL);
            Hooks.test.log(Status.INFO, "Redirected to Kajian detail page");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to redirect to Kajian detail page: " + e.getMessage());
        }
    }




}
