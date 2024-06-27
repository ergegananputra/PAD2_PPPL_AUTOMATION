package pages.admin.kategori_kajian;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class KategoriKajianPage extends AdminDashboardPage {
    KategoriKajianObject kategoriKajianObject;

    public KategoriKajianPage(WebDriver driver) {
        super(driver);
        kategoriKajianObject = new KategoriKajianObject(driver);
    }

    public void isOnPage() {
        assert (driver.getCurrentUrl().contains("kategori_kajian"));
    }

    public void clickTambahKategoriKajianButton() {
        driver.findElement(kategoriKajianObject.getTambahKategoriKajianButton()).click();
    }

    public void clickEditKategoriKajianLink(int id) {
        driver.findElement(kategoriKajianObject.getEditKategoriKajianLink(id)).click();
    }

    public void clickEditKategoriKajianLink() {
        driver.findElement(kategoriKajianObject.getEditKategoriKajianLink()).click();
    }

    public void clickDeleteKategoriKajianButton(int id) {
        driver.findElement(kategoriKajianObject.getDeleteKategoriKajianButton(id)).click();
    }

    public void clickDeleteKategoriKajianButton() {
        driver.findElement(kategoriKajianObject.getDeleteKategoriKajianButton()).click();
    }

    public void isDeleteFormDisplayed(int id) {
        driver.findElement(kategoriKajianObject.getDeleteKategoriKajianForm(id)).isDisplayed();
    }

    public void isTableDataKategoriKajianVisible() {
        driver.findElement(kategoriKajianObject.getTableDataKategoriKajian()).isDisplayed();
    }

    public void putSearchInput(String keyword) {
        driver.findElement(kategoriKajianObject.getSearchInput()).sendKeys(keyword);
    }

    public void isSearchResultVisible(String keyword) {
        driver.findElement(kategoriKajianObject.getSearchResult(keyword)).isDisplayed();
    }

    public void isThereNoSearchResult(String keyword) {
        assert(driver.findElements(kategoriKajianObject.getSearchResult(keyword)).isEmpty());
    }

    public void putNamaKategori(String keyword) {
        driver.findElement(kategoriKajianObject.getNamaKategoriInput()).sendKeys(keyword);
    }

    public void clickSubmitButton() {
        driver.findElement(kategoriKajianObject.getSubmitButton()).click();
    }
}
