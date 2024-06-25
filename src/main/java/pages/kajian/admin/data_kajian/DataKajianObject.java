package pages.kajian.admin.data_kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataKajianObject {
    WebDriver driver;

    public DataKajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTitleDataKajian() {
        return By.xpath("//*[contains(text(), 'Manajemen Kajian')]");
    }

    public By getTableDataKajian() {
        return By.xpath("//table[@id='datatablesSimple']");
    }

    public By getButtonTambahDataKajian() {
        return By.xpath("//*[contains(text(), 'Tambah Data Kajian')]");
    }

    public By getDeleteKajianButton(int id) {
        return By.xpath("//tr[td[contains(text(), '" + id + "')]]//button[@title='Delete']");
    }

    public By getSearchInput() {
        return By.xpath("//input[contains(@placeholder, 'Search')]");
    }

    public By getSearchResult(String keyword) {
        return By.xpath("//td[contains(text(), '" + keyword + "')]");
    }
}