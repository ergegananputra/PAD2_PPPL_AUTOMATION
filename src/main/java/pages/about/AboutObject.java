package pages.about;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutObject {
    WebDriver driver;

    public AboutObject(WebDriver driver) {
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

}
