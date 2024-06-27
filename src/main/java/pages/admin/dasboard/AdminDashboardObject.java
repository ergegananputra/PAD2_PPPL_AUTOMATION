package pages.admin.dasboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardObject {
    WebDriver driver;

    public AdminDashboardObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public By getMenuDashboard() {
        return By.xpath("//div[@class='nav']//a[normalize-space()='Dashboard']");
    }

    public By getMenuDataKajian() {
        return By.xpath("//div[@class='nav']//a[normalize-space()='Data Kajian']");
    }

    public By getMenuDataUser() {
        return By.xpath("//div[@class='nav']//a[normalize-space()='Data User']");
    }

    public By getHistoryLogin() {
        return By.xpath("//div[@class='nav']//a[normalize-space()='History Login']");
    }

    public By getHistoryDownload() {
        return By.xpath("//div[@class='nav']//a[normalize-space()='History Download']");
    }

    public By getKategoriKajian() {
        return By.xpath("//div[@class='nav']//a[normalize-space()='Kategori Kajian']");
    }

    public By getLogout() {
        return By.xpath("//div[@class='nav']//a[normalize-space()='Logout']");
    }

    public By getHistoryUpload() {return By.xpath("//div[@class='nav']//a[normalize-space()='History Upload']");}
}
