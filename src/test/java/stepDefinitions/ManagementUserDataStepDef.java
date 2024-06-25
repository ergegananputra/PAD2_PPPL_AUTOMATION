package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.admin.dasboard.AdminDashboardPage;
import pages.admin.data_user.AdminDataUserPage;
import pages.login.LoginPage;

import static org.junit.Assert.assertTrue;

public class ManagementUserDataStepDef {
    WebDriver driver;
    AdminDashboardPage dashboard;
    AdminDataUserPage adminDataUserPage;


    void setupDriver() {
        driver = new EdgeDriver();

//        System.setProperty("webdriver.edge.driver", "D:\\Download Program\\edgedriver_win64\\msedgedriver.exe");

        driver.manage().window().maximize();

        String url = "https://dev.mwcc.masmoendigital.store/login";
        driver.get(url);

        LoginPage login = new LoginPage(driver);
        login.putEmail("admin@mail.com");
        login.putPassword("11111111");
        login.clickSubmit();

        adminDataUserPage = new AdminDataUserPage(driver);
    }

    @Given("a web browser is at the Dashboard Admin Panel MWCC")
    public void a_web_browser_is_at_the_dashboard_admin_panel_mwcc() throws InterruptedException {
        setupDriver();
        dashboard = new AdminDashboardPage(driver);

        String actualURL = dashboard.getURL();
        String containURL = "admin";

        assertTrue(actualURL.contains(containURL));
    }

    @When("the users clicks the Data User on the side menu")
    public void theUsersClicksTheDataUserOnTheSideMenu() {
        adminDataUserPage.clickMenuDataUser();
    }

    @Then("list of users are shown on the result page")
    public void listOfUsersAreShownOnTheResultPage() {
        adminDataUserPage.isOnPage();
        adminDataUserPage.isTableDataUserVisible();
        adminDataUserPage.isTitleDataUserVisible();
    }

    @Given("a web browser is at the Data User page")
    public void aWebBrowserIsAtTheDataUserPage() {

        if (driver == null) {
            setupDriver();
        }

        adminDataUserPage.clickMenuDataUser();
    }


    @When("the user enter {string} on the search bar")
    public void theUserEnterOnTheSearchBar(String string) {
        adminDataUserPage.putSearchInput(string);
    }

    @Then("user that the name contain {string} shown on the result page")
    public void userThatTheNameContainShownOnTheResultPage(String string) {
        adminDataUserPage.isSearchResultVisible(string);
    }

    @When("the user click one of the eye icon on the user item")
    public void theUserClickOneOfTheEyeIconOnTheUserItem() {
        adminDataUserPage.clickUserDetail(0);
    }

    @Then("a detail of the selected user is shown on the result page")
    public void aDetailOfTheSelectedUserIsShownOnTheResultPage() {
        adminDataUserPage.isOnDetailUserPage();
    }

    @Given("a web browser is at the Data User Detail page")
    public void aWebBrowserIsAtTheDataUserDetailPage() {
        if (driver == null) setupDriver();

        adminDataUserPage.clickMenuDataUser();
        adminDataUserPage.clickUserDetail(0);
    }

    @When("the user click one of the pen icon on the user item")
    public void theUserClickOneOfThePenIconOnTheUserItem() {
        adminDataUserPage.clickEditIconUserDetail();
    }

    @Then("a pre-filled form related to the user is shown")
    public void aPreFilledFormRelatedToTheUserIsShown() {
        adminDataUserPage.isOnDetailUserEditFormPage();
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}