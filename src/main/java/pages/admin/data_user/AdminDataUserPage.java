package pages.admin.data_user;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class AdminDataUserPage extends AdminDashboardPage {
    AdminDataUserObject adminDataUserObject;

    public AdminDataUserPage(WebDriver driver) {
        super(driver);
        adminDataUserObject = new AdminDataUserObject(driver);
    }

    public void isOnPage() {
        assert(super.driver.getCurrentUrl().contains("users"));
    }

    public void isTableDataUserVisible() {
        super.driver.findElement(adminDataUserObject.getTableDataUser()).isDisplayed();
    }

    public void isTitleDataUserVisible() {
        super.driver.findElement(adminDataUserObject.getTitleDataUser()).isDisplayed();
    }

    public void putSearchInput(String keyword) {
        super.driver.findElement(adminDataUserObject.getSearchInput()).sendKeys(keyword);
    }

    public void isSearchResultVisible(String keyword) {
        super.driver.findElement(adminDataUserObject.getSearchResult(keyword)).isDisplayed();
    }

    public void clickUserDetail(int id) {
        super.driver.findElement(adminDataUserObject.getUserDetailButton(id)).click();
    }

    public void isOnDetailUserPage() {
        assert(driver.findElement(adminDataUserObject.getTitleDetailUser()).isDisplayed());
    }

    public void clickEditIconUserDetail() {
        super.driver.findElement(adminDataUserObject.getEditIconUserDetail()).click();
    }

    public void isOnDetailUserEditFormPage() {
        assert(driver.getCurrentUrl().contains("edit"));
    }
}
