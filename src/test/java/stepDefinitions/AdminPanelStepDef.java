package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import pages.admin.dasboard.AdminDashboardPage;
import pages.admin.data_kajian.AdminDataKajianPage;
import pages.admin.data_user.AdminDataUserPage;
import pages.admin.history_download.AdminHistoryDownloadPage;
import pages.admin.history_login.AdminHistoryLoginPage;
import pages.admin.history_upload.AdminHistoryUploadPage;
import pages.admin.kategori_kajian.KategoriKajianPage;
import pages.kajian.read.detail_kajian_versi_baru.DetailKajianVersiBaruPage;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AdminPanelStepDef {
    static WebDriver driver;
    static AdminDashboardPage dasboard;
    static AdminDataKajianPage dataKajian;
    static AdminDataUserPage dataUser;
    static AdminHistoryDownloadPage historyDownload;
    static AdminHistoryLoginPage historyLogin;
    static AdminHistoryUploadPage historyUpload;
    static KategoriKajianPage kategoriKajian;
    static DetailKajianVersiBaruPage detailKajian;

    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
        if (dasboard == null) {
            dasboard = new AdminDashboardPage(driver);
        }
        if (dataKajian == null) {
            dataKajian = new AdminDataKajianPage(driver);
        }
        if (dataUser == null) {
            dataUser = new AdminDataUserPage(driver);
        }
        if (historyDownload == null) {
            historyDownload = new AdminHistoryDownloadPage(driver);
        }
        if (historyLogin == null) {
            historyLogin = new AdminHistoryLoginPage(driver);
        }
        if (historyUpload == null) {
            historyUpload = new AdminHistoryUploadPage(driver);
        }
        if (kategoriKajian == null) {
            kategoriKajian = new KategoriKajianPage(driver);
        }
        if (detailKajian == null) {
            detailKajian = new DetailKajianVersiBaruPage(driver);
        }

        Hooks.test.info("Setup Driver on AdminPanelStepDef");
    }

    @Given("user is on admin panel")
    public void user_is_on_admin_panel() {
        setupDriver();

        String url = "https://dev.mwcc.masmoendigital.store/admin/dashboard";
        driver.get(url);

        String actualURL = dasboard.getURL();
        if (!actualURL.contains("admin")) {
            Hooks.test.fail("Failed to open Admin Panel");
        }
    }

    @When("the user click on the {string} menu admin page")
    public void theUserClickOnTheMenu(String menu) {
        try {
            switch (menu.toLowerCase()) {
                case "dashboard":
                    dasboard.clickMenuDashboard();
                    break;
                case "data kajian":
                    dasboard.clickMenuDataKajian();
                    break;
                case "data user":
                    dasboard.clickMenuDataUser();
                    break;
                case "history login":
                    dasboard.clickHistoryLogin();
                    break;
                case "history download":
                    dasboard.clickHistoryDownload();
                    break;
                case "history upload":
                    dasboard.clickHistoryUpload();
                    break;
                case "kategori kajian":
                    dasboard.clickKategoriKajian();
                    break;
                case "logout":
                    dasboard.clickLogout();
                    break;
            }
            Hooks.test.pass("Click on the " + menu + " menu");
        } catch (Exception e) {
            Hooks.test.fail("Failed to click on the " + menu + " menu");
        }

    }

    @Then("the user is redirected to the {string} admin page")
    public void theUserIsRedirectedToTheAdminPage(String menu) {
        try {
            switch (menu.toLowerCase()) {
                case "dashboard":
                    assert dasboard.getURL().contains("admin/dashboard");
                    break;
                case "data kajian":
                    assert dataKajian.getURL().contains("admin/kajian");
                    break;
                case "data user":
                    assert dataUser.getURL().contains("admin/users");
                    break;
                case "history login":
                    assert historyLogin.getURL().contains("admin/history_login");
                    break;
                case "history download":
                    assert historyDownload.getURL().contains("admin/history_download");
                    break;
                case "history upload":
                    assert historyUpload.getURL().contains("admin/history_upload");
                    break;
                case "kategori kajian":
                    assert kategoriKajian.getURL().contains("admin/kategori_kajian");
                    break;
            }
            Hooks.test.pass("Redirected to the " + menu + " page");
        } catch (Exception e) {
            Hooks.test.fail("Failed to redirect to the " + menu + " page");
        }
    }

    @And("the user fill the search form in history login with {string}")
    public void theUserFillTheSearchFormInHistoryLoginWith(String keyword) {
        try {
            historyLogin.putSearchInput(keyword);
            Hooks.test.pass("Fill the search form in history login with " + keyword);
        } catch (Exception e) {
            Hooks.test.fail("Failed to fill the search form in history login with " + keyword);
        }
    }

    @Then("the user see the history login with {string} in table")
    public void theUserSeeTheHistoryLoginWithInTable(String keyword) {
        try {
            historyLogin.isSearchResultVisible(keyword);
            Hooks.test.pass("See the history login with " + keyword + " in table");
        } catch (Exception e) {
            Hooks.test.fail("Failed to see the history login with " + keyword + " in table");
        }
    }

    @And("the user fill the search form in history download with {string}")
    public void theUserFillTheSearchFormInHistoryDownloadWith(String keyword) {
        try {
            historyDownload.putSearchInput(keyword);
            Hooks.test.pass("Fill the search form in history download with " + keyword);
        } catch (Exception e) {
            Hooks.test.fail("Failed to fill the search form in history download with " + keyword);
        }
    }

    @Then("the user see the history download with {string} in table")
    public void theUserSeeTheHistoryDownloadWithInTable(String keyword) {
        try {
            historyDownload.isSearchResultVisible(keyword);
            Hooks.test.pass("See the history download with " + keyword + " in table");
        } catch (Exception e) {
            Hooks.test.fail("Failed to see the history download with " + keyword + " in table");
        }
    }

    @And("the user fill the search form in history upload with {string}")
    public void theUserFillTheSearchFormInHistoryUploadWith(String keyword) {
        try {
            historyUpload.putSearchInput(keyword);
            Hooks.test.pass("Fill the search form in history upload with " + keyword);
        } catch (Exception e) {
            Hooks.test.fail("Failed to fill the search form in history upload with " + keyword);
        }
    }

    @Then("the user see the history upload with {string} in table")
    public void theUserSeeTheHistoryUploadWithInTable(String keyword) {
        try {
            historyUpload.isSearchResultVisible(keyword);
            Hooks.test.pass("See the history upload with " + keyword + " in table");
        } catch (Exception e) {
            Hooks.test.fail("Failed to see the history upload with " + keyword + " in table");
        }
    }

    @And("the user fill the search form in kategori kajian with {string}")
    public void theUserFillTheSearchFormInKategoriKajianWith(String keyword) {
        try {
            kategoriKajian.putSearchInput(keyword);
            Hooks.test.pass("Fill the search form in kategori kajian with " + keyword);
        } catch (Exception e) {
            Hooks.test.fail("Failed to fill the search form in kategori kajian with " + keyword);
        }
    }

    @Then("the user see the kategori kajian with {string} in table")
    public void theUserSeeTheKategoriKajianWithInTable(String keyword) {
        try {
            kategoriKajian.isSearchResultVisible(keyword);
            Hooks.test.pass("See the kategori kajian with " + keyword + " in table");
        } catch (Exception e) {
            Hooks.test.fail("Failed to see the kategori kajian with " + keyword + " in table");
        }
    }

    @And("the user click on the tambah kategori button in kategori kajian")
    public void theUserClickOnTheTambahKategoriButtonInKategoriKajian() {
        try {
            kategoriKajian.clickTambahKategoriKajianButton();
            String actualURL = kategoriKajian.getURL();
            assert actualURL.contains("admin/kategori_kajian/create");
            Hooks.test.pass("Click on the tambah kategori button in kategori kajian");
        } catch (Exception e) {
            Hooks.test.fail("Failed to click on the tambah kategori button in kategori kajian");
        }
    }

    @And("the user fill the form in tambah kategori with {string}")
    public void theUserFillTheFormInTambahKategoriWith(String keyword) {
        try {
            kategoriKajian.putNamaKategori(keyword);
            kategoriKajian.clickSubmitButton();
            Hooks.test.pass("Fill the form in tambah kategori with " + keyword);
        } catch (Exception e) {
            Hooks.test.fail("Failed to fill the form in tambah kategori with " + keyword);
        }
    }

    @And("the user click on the edit button in kategori kajian")
    public void theUserClickOnTheEditButtonInKategoriKajian() {
        try {
            kategoriKajian.clickEditKategoriKajianLink();
            String actualURL = kategoriKajian.getURL();
            assert actualURL.contains("/edit");
            Hooks.test.pass("Click on the edit button in kategori kajian");
        } catch (Exception e) {
            Hooks.test.fail("Failed to click on the edit button in kategori kajian");
        }
    }

    @And("the user click on the hapus button in kategori kajian")
    public void theUserClickOnTheHapusButtonInKategoriKajian() {
        try {
            kategoriKajian.clickDeleteKategoriKajianButton();
            Hooks.test.pass("Click on the hapus button in kategori kajian");
        } catch (Exception e) {
            Hooks.test.fail("Failed to click on the hapus button in kategori kajian");
        }
    }

    @And("the user click on the {string} button in alert dialog")
    public void theUserClickOnTheButtonInAlertDialog(String button) {
        try {
            Alert alert = driver.switchTo().alert();
            switch (button.toLowerCase()) {
                case "ya":
                    alert.accept();
                    break;
                case "tidak":
                    alert.dismiss();
                    break;
            }
            Hooks.test.pass("Click on the " + button + " button in alert dialog");
        } catch (Exception e) {
            Hooks.test.fail("Failed to click on the " + button + " button in alert dialog");
        }
    }

    @Then("the user see the kategori kajian with {string} not in table")
    public void theUserSeeTheKategoriKajianWithNotInTable(String keyword) {
        try {
            kategoriKajian.isThereNoSearchResult(keyword);
            Hooks.test.pass("See the kategori kajian with " + keyword + " not in table");
        } catch (Exception e) {
            Hooks.test.fail("See the kategori kajian with " + keyword + " in table");
        }
    }

    @And("the user fill the search form in data kajian page with {string}")
    public void theUserFillTheSearchFormInDataKajianPageWith(String keyword) {
        try {
            dataKajian.putSearchInput(keyword);
            Hooks.test.pass("Fill the search form in data kajian page with " + keyword);
        } catch (Exception e) {
            Hooks.test.fail("Failed to fill the search form in data kajian page with " + keyword);
        }
    }

    @Then("the user see the kajian with title {string} in the table")
    public void theUserSeeTheKajianWithTitleInTheTable(String keyword) {
        try {
            dataKajian.isSearchResultVisible(keyword);
            Hooks.test.pass("See the kajian with title " + keyword + " in the table");
        } catch (Exception e) {
            Hooks.test.fail("Failed to see the kajian with title " + keyword + " in the table");
        }
    }

    @And("the user click on the {string} button in the data kajian table")
    public void theUserClickOnTheButtonInTheDataKajianTable(String button) {
        try {
            switch (button.toLowerCase()) {
                case "detail":
                    dataKajian.clickButtonDetailKajian();
                    break;
                case "hapus":
                    dataKajian.clickButtonDeleteKajian();
                    break;
                case "tambah":
                    dataKajian.clickButtonTambahDataKajian();
                    break;
            }
            Hooks.test.pass("Click on the " + button + " button in the data kajian table");
        } catch (Exception e) {
            Hooks.test.fail("Failed to click on the " + button + " button in the data kajian table");
        }
    }

    @Then("the user is redirected to the detail kajian page with keyword {string}")
    public void theUserIsRedirectedToTheDetailKajianPageWithKeyword(String keyword) {
        try {
            boolean isContain = false;

            for (String contain : dataKajian.getURL().split(" ")) {
                if (contain.contains(keyword)) {
                    isContain = true;
                    break;
                }
            }

            assert isContain;

            Hooks.test.pass("Redirected to the detail kajian page with keyword " + keyword);
        } catch (Exception e) {
            Hooks.test.fail("Failed to redirect to the detail kajian page with keyword " + keyword);
        }
    }


    @And("the user click on the {string} button in the detail kajian page")
    public void theUserClickOnTheButtonInTheDetailKajianPage(String button) {
        try {
            switch (button.toLowerCase()) {
                case "download":
                    detailKajian.getDownloadKajianButton().click();
                    break;
                case "share":
                    detailKajian.getShareKajianButton().click();
                    break;
            }
            Hooks.test.pass("Click on the " + button + " button in the detail kajian page");
        } catch (Exception e) {
            Hooks.test.fail("Failed to click on the " + button + " button in the detail kajian page");
        }
    }

    @Then("the user copied the kajian url")
    public void theUserCopiedTheKajianUrl() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();

            Hooks.test.pass("Copied the kajian url");
        } catch (Exception e) {
            Hooks.test.fail("Failed to copy the kajian url");
        }
    }

    @Then("the user see the commit message in the detail kajian page")
    public void theUserSeeTheCommitMessageInTheDetailKajianPage() {
        try {
            detailKajian.getKajianContentDifference().isDisplayed();
            Hooks.test.pass("See the commit message in the detail kajian page");
        } catch (Exception e) {
            Hooks.test.fail("Failed to see the commit message in the detail kajian page");
        }
    }


}
