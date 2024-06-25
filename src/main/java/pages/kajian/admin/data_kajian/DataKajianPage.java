package pages.kajian.admin.data_kajian;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class DataKajianPage extends AdminDashboardPage {
    DataKajianObject dataKajianObject;

    public DataKajianPage(WebDriver driver) {
        super(driver);
        dataKajianObject = new DataKajianObject(driver);
    }

    public boolean isTitleDataKajianVisible() {
        return driver.findElement(dataKajianObject.getTitleDataKajian()).isDisplayed();
    }

    public boolean isTableDataKajianVisible() {
        return driver.findElement(dataKajianObject.getTableDataKajian()).isDisplayed();
    }

    public void clickTambahDataKajianButton() {
        driver.findElement(dataKajianObject.getButtonTambahDataKajian()).click();
    }

    public void putSearchInput(String keyword) {
        driver.findElement(dataKajianObject.getSearchInput()).sendKeys(keyword);
    }

    public boolean isSearchResultVisible(String keyword) {
        return driver.findElement(dataKajianObject.getSearchResult(keyword)).isDisplayed();
    }
}
