package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.home.HomePage;
import pages.kajian.main.kajian.KajianPage;

import static org.junit.Assert.assertTrue;

public class PublicKajianMainStepDef {

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

    @Given("a web browser is at the MWCC main page")
    public void a_web_browser_is_at_the_mwcc_main_page() {
        try {
            setup(); // Ensure setup is called once before all tests
            driver.get("https://dev.mwcc.masmoendigital.store/");
            String actualURL = homePage.getURL();
            System.out.println("Actual URL: " + actualURL);
            String containURL = "https://dev.mwcc.masmoendigital.store/";

            assertTrue("Expected URL to contain: " + containURL, actualURL.contains(containURL));

            Hooks.test.log(Status.INFO, "Open browser at MWCC Main Page");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to open browser at MWCC Main Page: " + e.getMessage());
        }
    }

    @When("the users clicks the Kajian on the navigation bar")
    public void theUsersClicksTheKajianOnTheNavigationBar() {
        try {
            homePage.clickKajianNavbar();
            Hooks.test.log(Status.INFO, "Click Kajian on the navigation bar");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to click Kajian on the navigation bar: " + e.getMessage());
        }
    }

    @Then("the users are redirected to the Kajian page")
    public void TheUsersAreRedirectedToTheKajianPage() {
        try {
            String actualURL = KajianMainPage.getURL();
            System.out.println("Actual URL: " + actualURL);
            String containURL = "https://dev.mwcc.masmoendigital.store/kajian";

            Hooks.test.log(Status.INFO, "Actual URL: " + actualURL);

            assertTrue("Expected URL to contain: " + containURL, actualURL.contains(containURL));

            Hooks.test.log(Status.PASS, "Redirected to the Kajian page");
        } catch (Exception e) {
            // Print the error message to the terminal
            System.out.println("Failed to redirect to the Kajian page: " + e.getMessage());

            Hooks.test.log(Status.FAIL, "Failed to redirect to the Kajian page: " + e.getMessage());
        }
    }

    @Then("the users can see the preferenced kajian")
    public void theUsersCanSeeThePreferencedKajian() {
        try {
            String ambilJudul = KajianMainPage.getKajianRekomendasiHeading();

            assertTrue("Expected heading to contain 'Kajian Rekomendasi'", ambilJudul.contains("Kajian Rekomendasi"));

            Hooks.test.log(Status.PASS, "See the preferenced kajian");
        } catch (Exception e) {
            Hooks.test.log(Status.FAIL, "Failed to see the preferenced kajian: " + e.getMessage());
        }
    }
}
