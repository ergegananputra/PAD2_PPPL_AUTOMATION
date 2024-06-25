package pages.kajian.read.download_kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadKajianObject {
    WebDriver driver;

    public DownloadKajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getDownloadKajianButton() {
        return By.xpath("//button[contains(@class, 'btn-download-share-kajian') and contains(text(), 'Unduh File Kajian')]");
    }
}