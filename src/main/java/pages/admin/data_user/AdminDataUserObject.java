package pages.admin.data_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDataUserObject {
    WebDriver driver;

    public AdminDataUserObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTableDataUser() {
        return By.xpath("//table[@id='datatablesSimple']");
    }

    public By getTitleDataUser() {
        return By.xpath("//*[contains(text(), 'Manajemen User')]");
    }

    public By getSearchInput() {
        return By.xpath("//input[contains(@placeholder, 'Search')]");
    }

    public By getSearchResult(String keyword) {
        return By.xpath("//td[contains(text(), '" + keyword + "')]");
    }

    public By getUserDetailButton(int id) {
        return By.xpath("//a[@title='View' and contains(@href, "+id+")]");
    }

    public By getTitleDetailUser() {
        return By.xpath("//*[contains(text(), 'User Account')]");
    }

    public By getEditIconUserDetail() {
        return By.xpath("//button[contains(@onclick, 'edit')]");
    }

    public By getDeleteKajianButton(int id) {
        return By.xpath("//tr[td[contains(text(), '" + id + "')]]//button[@title='Delete']");
    }

}