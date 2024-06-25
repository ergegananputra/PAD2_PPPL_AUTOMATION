package pages.admin.dasboard;

import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {
    protected WebDriver driver;
    AdminDashboardObject adminDashboardObject;

    public AdminDashboardPage(WebDriver driver) {
        this.driver = driver;
        adminDashboardObject = new AdminDashboardObject(driver);
    }

    public void clickMenuDashboard() {
        driver.findElement(adminDashboardObject.getMenuDashboard()).click();
    }

    public void clickMenuDataKajian() {
        driver.findElement(adminDashboardObject.getMenuDataKajian()).click();
    }

    public void clickMenuDataUser() {
        driver.findElement(adminDashboardObject.getMenuDataUser()).click();
    }

    public void clickHistoryLogin() {
        driver.findElement(adminDashboardObject.getHistoryLogin()).click();
    }

    public void clickHistoryDownload() {
        driver.findElement(adminDashboardObject.getHistoryDownload()).click();
    }

    public void clickKategoriKajian() {
        driver.findElement(adminDashboardObject.getKategoriKajian()).click();
    }

    public void clickLogout() {
        driver.findElement(adminDashboardObject.getLogout()).click();
    }

    public String getURL() {
        return adminDashboardObject.getURL();
    }
}
