package pages.admin.data_kajian;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class AdminDataKajianPage extends AdminDashboardPage {
    AdminDataKajianObject adminDataKajianObject;

    public AdminDataKajianPage(WebDriver driver) {
        super(driver);
        adminDataKajianObject = new AdminDataKajianObject(driver);
    }

    public void isOnPage() {
        assert(super.driver.getCurrentUrl().contains("kajian"));
    }

    public void isTableDataKajianVisible() {
        super.driver.findElement(adminDataKajianObject.getTableDataKajian()).isDisplayed();
    }

    public void isTitleDataKajianVisible() {
        super.driver.findElement(adminDataKajianObject.getTitleDataKajian()).isDisplayed();
    }

    public void clickButtonTambahDataKajian() {
        super.driver.findElement(adminDataKajianObject.getButtonTambahDataKajian()).click();
    }

    public void putSearchInput(String keyword) {
        super.driver.findElement(adminDataKajianObject.getSearchInput()).sendKeys(keyword);
    }

    public void isSearchResultVisible(String keyword) {
        super.driver.findElement(adminDataKajianObject.getSearchResult(keyword)).isDisplayed();
    }

    public void clickButtonDetailKajian() {
        super.driver.findElement(adminDataKajianObject.getDetailKajianButton()).click();
    }

    public void clickButtonDeleteKajian() {
        super.driver.findElement(adminDataKajianObject.getDeleteKajianButton()).click();
    }
}
