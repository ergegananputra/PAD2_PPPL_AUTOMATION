package pages.kajian.read.detail_kajian_original;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailKajianOriginalPage {
    WebDriver driver;
    DetailKajianOriginalObject detailKajianOriginalObject;

    public DetailKajianOriginalPage(WebDriver driver) {
        this.driver = driver;
        detailKajianOriginalObject = new DetailKajianOriginalObject(driver);
    }

    public WebElement getUserProfileLink() {
        return driver.findElement(detailKajianOriginalObject.getUserProfileLink());
    }

    public WebElement getUserProfileImage() {
        return driver.findElement(detailKajianOriginalObject.getUserProfileImage());
    }

    public WebElement getUserName() {
        return driver.findElement(detailKajianOriginalObject.getUserName());
    }

    public WebElement getKajianImage() {
        return driver.findElement(detailKajianOriginalObject.getKajianImage());
    }

    public WebElement getKajianTitle() {
        return driver.findElement(detailKajianOriginalObject.getKajianTitle());
    }

    public WebElement getKajianSpeaker() {
        return driver.findElement(detailKajianOriginalObject.getKajianSpeaker());
    }

    public WebElement getKajianDate() {
        return driver.findElement(detailKajianOriginalObject.getKajianDate());
    }

    public WebElement getKajianLocation() {
        return driver.findElement(detailKajianOriginalObject.getKajianLocation());
    }

    public WebElement getKajianDescription() {
        return driver.findElement(detailKajianOriginalObject.getKajianDescription());
    }

    public WebElement getDownloadKajianButton() {
        return driver.findElement(detailKajianOriginalObject.getDownloadKajianButton());
    }

    public WebElement getShareKajianButton() {
        return driver.findElement(detailKajianOriginalObject.getShareKajianButton());
    }

    public WebElement getUploadNewKajianButton() {
        return driver.findElement(detailKajianOriginalObject.getUploadNewKajianButton());
    }

    public WebElement getNewKajianHeading() {
        return driver.findElement(detailKajianOriginalObject.getNewKajianHeading());
    }

    public WebElement getNewKajianUserName() {
        return driver.findElement(detailKajianOriginalObject.getNewKajianUserName());
    }

    public WebElement getNewKajianUserImage() {
        return driver.findElement(detailKajianOriginalObject.getNewKajianUserImage());
    }

    public WebElement getNewKajianLink() {
        return driver.findElement(detailKajianOriginalObject.getNewKajianLink());
    }

    public WebElement getNewKajianArrowButton() {
        return driver.findElement(detailKajianOriginalObject.getNewKajianArrowButton());
    }
}
