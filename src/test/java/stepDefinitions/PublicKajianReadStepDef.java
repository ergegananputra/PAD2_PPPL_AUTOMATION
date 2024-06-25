package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import pages.kajian.main.kajian.KajianPage;

public class PublicKajianReadStepDef {
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
}
