package pages.kajian.main.kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KajianObject {
    WebDriver driver;

    public KajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getSearchResult(String keyword) {
        return By.xpath("//div[contains(@class, 'kajian-item') and (contains(@data-title, '" + keyword + "') or contains(@data-pemateri, '" + keyword + "') or contains(@data-deskripsi, '" + keyword + "') or contains(@data-kategori, '" + keyword + "'))]");
    }

    public By getCreateKajianButton() {
        return By.xpath("//section[@id='search']//a[contains(text(), 'Unggah Kajian')]");
    }
    public By getLihatSemuaLink() {
        return By.xpath("//section[@id='kajian-muhammadiyah']//a[contains(text(), 'Lihat Semua')]");
    }
    public By getNextButtonImage() {
        return By.xpath("//section[@id='kajian-muhammadiyah']//img[@alt='Next Button']");
    }

    public By getCardTitleByIndex(int index) {
        return By.xpath("(//section[@id='kajian-muhammadiyah']//div[@class='card-kajian-title'])[" + index + "]");
    }

    public By getCardDescriptionByIndex(int index) {
        return By.xpath("(//section[@id='kajian-muhammadiyah']//p[@class='card-kajian-text'])[" + index + "]");
    }

    public By getLihatSelengkapnyaLinkByIndex(int index) {
        return By.xpath("(//section[@id='kajian-muhammadiyah']//a[@class='btn btn-view'])[" + index + "]");
    }

    public By getKajianRekomendasiHeading() {
        return By.id("title-kajian-rekomendasi");
    }

    public By getKategoriList() {
        return By.cssSelector(".list-rekomendasi .kategori");
    }

    public By getCategoryAddDropdown() {
        return By.id("category-add-dropdown");
    }

    public By getCategoryAddButton() {
        return By.id("dropdownMenuButton1");
    }

    public By getCategoryDropdownItems() {
        return By.cssSelector("#category-add-dropdown .dropdown-menu .dropdown-item");
    }

    public By getKajianRekomendasiResults() {
        return By.id("kajianRekomendasiResults");
    }

    public By getKajianItems() {
        return By.cssSelector(".kajian-item");
    }

    public By getKajianItemImage() {
        return By.cssSelector(".kajian-item .img-card-kajian");
    }

    public By getKajianItemTitle() {
        return By.cssSelector(".kajian-item .card-kajian-title");
    }

    public By getKajianItemDescription() {
        return By.cssSelector(".kajian-item .card-kajian-text");
    }

    public By getKajianItemCategory() {
        return By.cssSelector(".kajian-item .card-kajian-category");
    }

    public By getKajianItemViewMoreButton() {
        return By.cssSelector(".kajian-item .btn-view");
    }

    public By getCardTitleByIndexTerkini(int index) {
        return By.xpath("(//section[@id='kajian-terkini']//div[@class='card-kajian-title'])[" + index + "]");
    }

    public By getCardDescriptionByIndexTerkini(int index) {
        return By.xpath("(//section[@id='kajian-terkini']//p[@class='card-kajian-text'])[" + index + "]");
    }

    public By getLihatSelengkapnyaLinkByIndexTerkini(int index) {
        return By.xpath("(//section[@id='kajian-terkini']//a[@class='btn btn-view'])[" + index + "]");
    }

}
