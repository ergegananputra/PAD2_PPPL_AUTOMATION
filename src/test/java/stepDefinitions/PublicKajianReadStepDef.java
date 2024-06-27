//package stepDefinitions;
//
//import io.cucumber.java.BeforeAll;
//import org.openqa.selenium.WebDriver;
//
//public class PublicKajianReadStepDef {
//    static WebDriver driver;
//
//
//    @BeforeAll
//    void setup(){
//        try {
//            driver = Hooks.getDriver();
//            if (publicKajianReadPage == null) {
//                publicKajianReadPage = new PublicKajianReadPage(driver);
//            }
//
//            Hooks.test.log(Status.INFO, "Setup Driver on PublicKajianReadStepDef");
//        } catch (Exception e) {
//            Hooks.test.log(Status.FAIL, "Setup failed: " + e.getMessage());
//        }
//    }
//}
