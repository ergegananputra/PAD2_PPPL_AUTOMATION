package pages.admin.history_upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHistoryUploadObject {
    WebDriver driver;

    public AdminHistoryUploadObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTableDataUpload() {
        return By.xpath("//table[@id='datatablesSimple']");
    }

    public By getTitleDataUpload() {
        return By.xpath("//h1[contains(text(), 'History Upload')]");
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