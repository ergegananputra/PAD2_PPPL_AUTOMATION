package pages.kajian.read.share_kajian;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShareKajianPage {
    WebDriver driver;
    ShareKajianObject shareKajianObject;

    public ShareKajianPage(WebDriver driver) {
        this.driver = driver;
        shareKajianObject = new ShareKajianObject(driver);
    }

    public WebElement getShareKajianButton() {
        return driver.findElement(shareKajianObject.getShareKajianButton());
    }
}
