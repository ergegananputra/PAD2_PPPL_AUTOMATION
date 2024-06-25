package pages.kajian.read.share_kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShareKajianObject {
    WebDriver driver;

    public ShareKajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getShareKajianButton() {
        return By.xpath("//button[contains(@class, 'btn-download-share-kajian') and contains(text(), 'Bagikan Tautan Kajian')]");
    }
}