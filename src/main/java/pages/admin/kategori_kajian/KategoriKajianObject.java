package pages.admin.kategori_kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KategoriKajianObject {
    WebDriver driver;

    public KategoriKajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTambahKategoriKajianButton() {
        return By.xpath("//a[contains(@href, '/admin/kategori_kajian/create') and contains(@class, 'btn btn-primary')]");
    }

    public By getEditKategoriKajianLink(int id) {
        return By.xpath("//tr[td[text()='" + id + "']]//a[contains(@href, '/admin/kategori_kajian/" + id + "/edit')]");
    }

    public By getDeleteKategoriKajianForm(int id) {
        return By.xpath("//tr[td[text()='" + id + "']]//form[@action='/admin/kategori_kajian/" + id + "']");
    }

    public By getDeleteKategoriKajianButton(int id) {
        return By.xpath("//tr[td[text()='" + id + "']]//button[@title='Delete']");
    }

    public By getTableDataKategoriKajian() {
        return By.xpath("//table[@id='datatablesSimple']");
    }

}

