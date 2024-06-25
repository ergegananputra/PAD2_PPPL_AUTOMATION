package pages.utilities.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchObject {
    WebDriver driver;
    public SearchObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getSearchResult(String keyword) {
        return By.xpath("//div[contains(@class, 'kajian-item') and (contains(@data-title, '" + keyword + "') or contains(@data-pemateri, '" + keyword + "') or contains(@data-deskripsi, '" + keyword + "') or contains(@data-kategori, '" + keyword + "'))]");
    }
}
