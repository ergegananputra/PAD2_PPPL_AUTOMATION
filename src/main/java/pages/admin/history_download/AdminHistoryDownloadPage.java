package pages.admin.history_download;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class AdminHistoryDownloadPage extends AdminDashboardPage {
    AdminHistoryDownloadObject adminHistoryDownloadObject;

    public AdminHistoryDownloadPage(WebDriver driver) {
        super(driver);
        adminHistoryDownloadObject = new AdminHistoryDownloadObject(driver);
    }

    public void isOnPage() {
        assert(super.driver.getCurrentUrl().contains("history-download"));
    }

    public void isTableDataUserVisible() {
        super.driver.findElement(adminHistoryDownloadObject.getTableDataUser()).isDisplayed();
    }

    public void isTitleDataUserVisible() {
        super.driver.findElement(adminHistoryDownloadObject.getTitleDataUser()).isDisplayed();
    }

    public void putStartDate(String startDate) {
        super.driver.findElement(adminHistoryDownloadObject.getStartDateInput()).sendKeys(startDate);
    }

    public void putEndDate(String endDate) {
        super.driver.findElement(adminHistoryDownloadObject.getEndDateInput()).sendKeys(endDate);
    }

    public void clickFilterButton() {
        super.driver.findElement(adminHistoryDownloadObject.getFilterButton()).click();
    }

    public void putSearchInput(String keyword) {
        super.driver.findElement(adminHistoryDownloadObject.getSearchInput()).sendKeys(keyword);
    }

    public void isSearchResultVisible(String keyword) {
        super.driver.findElement(adminHistoryDownloadObject.getSearchResult(keyword)).isDisplayed();
    }
}
