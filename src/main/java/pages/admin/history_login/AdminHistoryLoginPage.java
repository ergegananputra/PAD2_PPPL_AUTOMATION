package pages.admin.history_login;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class AdminHistoryLoginPage extends AdminDashboardPage {
    AdminHistoryLoginObject adminHistoryLoginObject;

    public AdminHistoryLoginPage(WebDriver driver) {
        super(driver);
        adminHistoryLoginObject = new AdminHistoryLoginObject(driver);
    }

    public void isOnPage() {
        assert(super.driver.getCurrentUrl().contains("history-login"));
    }

    public void isTableDataUserVisible() {
        super.driver.findElement(adminHistoryLoginObject.getTableDataUser()).isDisplayed();
    }

    public void isTitleDataUserVisible() {
        super.driver.findElement(adminHistoryLoginObject.getTitleDataUser()).isDisplayed();
    }

    public void putStartDate(String startDate) {
        super.driver.findElement(adminHistoryLoginObject.getStartDateInput()).sendKeys(startDate);
    }

    public void putEndDate(String endDate) {
        super.driver.findElement(adminHistoryLoginObject.getEndDateInput()).sendKeys(endDate);
    }

    public void clickFilterButton() {
        super.driver.findElement(adminHistoryLoginObject.getFilterButton()).click();
    }

    public void putSearchInput(String keyword) {
        super.driver.findElement(adminHistoryLoginObject.getSearchInput()).sendKeys(keyword);
    }

    public void isSearchResultVisible(String keyword) {
        super.driver.findElement(adminHistoryLoginObject.getSearchResult(keyword)).isDisplayed();
    }

    public void clickUserDetail(int id) {
        super.driver.findElement(adminHistoryLoginObject.getUserDetailButton(id)).click();
    }

    public void isOnDetailUserPage() {
        assert(super.driver.findElement(adminHistoryLoginObject.getTitleDetailUser()).isDisplayed());
    }
}
