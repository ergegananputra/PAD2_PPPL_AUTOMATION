package pages.admin.history_download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHistoryDownloadObject {
    WebDriver driver;

    public AdminHistoryDownloadObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTableDataUser() {
        return By.xpath("//table[@id='datatablesSimple']");
    }

    public By getTitleDataUser() {
        return By.xpath("//h1[contains(text(), 'History Download')]");
    }

    public By getStartDateInput() {
        return By.id("startDate");
    }

    public By getEndDateInput() {
        return By.id("endDate");
    }

    public By getFilterButton() {
        return By.id("filterBtn");
    }

    public By getSearchInput() {
        return By.xpath("//input[contains(@placeholder, 'Search')]");
    }

    public By getSearchResult(String keyword) {
        return By.xpath("//td[contains(text(), '" + keyword + "')]");
    }

}