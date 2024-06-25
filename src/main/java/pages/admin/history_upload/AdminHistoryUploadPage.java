package pages.admin.history_upload;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class AdminHistoryUploadPage extends AdminDashboardPage {
    AdminHistoryUploadObject adminHistoryUploadObject;

    public AdminHistoryUploadPage(WebDriver driver) {
        super(driver);
        adminHistoryUploadObject = new AdminHistoryUploadObject(driver);
    }

    public void isOnPage() {
        assert(super.driver.getCurrentUrl().contains("history-upload"));
    }

    public void isTableDataUploadVisible() {
        super.driver.findElement(adminHistoryUploadObject.getTableDataUpload()).isDisplayed();
    }

    public void isTitleDataUploadVisible() {
        super.driver.findElement(adminHistoryUploadObject.getTitleDataUpload()).isDisplayed();
    }

    public void putStartDate(String startDate) {
        super.driver.findElement(adminHistoryUploadObject.getStartDateInput()).sendKeys(startDate);
    }

    public void putEndDate(String endDate) {
        super.driver.findElement(adminHistoryUploadObject.getEndDateInput()).sendKeys(endDate);
    }

    public void clickFilterButton() {
        super.driver.findElement(adminHistoryUploadObject.getFilterButton()).click();
    }

    public void putSearchInput(String keyword) {
        super.driver.findElement(adminHistoryUploadObject.getSearchInput()).sendKeys(keyword);
    }

    public void isSearchResultVisible(String keyword) {
        super.driver.findElement(adminHistoryUploadObject.getSearchResult(keyword)).isDisplayed();
    }
}
