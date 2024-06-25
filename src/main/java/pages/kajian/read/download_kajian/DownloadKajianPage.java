package pages.kajian.read.download_kajian;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadKajianPage {
    WebDriver driver;
    DownloadKajianObject downloadKajianObject;

    public DownloadKajianPage(WebDriver driver) {
        this.driver = driver;
        downloadKajianObject = new DownloadKajianObject(driver);
    }

    public WebElement getDownloadKajianButton() {
        return driver.findElement(downloadKajianObject.getDownloadKajianButton());
    }
}
