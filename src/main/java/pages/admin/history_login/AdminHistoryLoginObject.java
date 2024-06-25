package pages.admin.history_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHistoryLoginObject {
    WebDriver driver;

    public AdminHistoryLoginObject(WebDriver driver) {
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

    public By getUserDetailButton(int id) {
        return By.xpath("//td[text()='" + id + "']/following-sibling::td/a[@title='View']");
    }

    public By getTitleDetailUser() {
        return By.xpath("//h1[contains(text(), 'User Account')]");
    }

}