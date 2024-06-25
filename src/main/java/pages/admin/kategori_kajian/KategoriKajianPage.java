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

    public void clickDeleteKategoriKajianButton(int id) {
        driver.findElement(kategoriKajianObject.getDeleteKategoriKajianButton(id)).click();
    }

    public void isDeleteFormDisplayed(int id) {
        driver.findElement(kategoriKajianObject.getDeleteKategoriKajianForm(id)).isDisplayed();
    }

    public void isTableDataKategoriKajianVisible() {
        driver.findElement(kategoriKajianObject.getTableDataKategoriKajian()).isDisplayed();
    }
}
