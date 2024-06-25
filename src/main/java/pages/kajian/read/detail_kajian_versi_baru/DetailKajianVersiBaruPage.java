package pages.kajian.read.detail_kajian_versi_baru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailKajianVersiBaruPage {
    WebDriver driver;
    DetailKajianVersiBaruObject detailKajianVersiBaruObject;

    public DetailKajianVersiBaruPage(WebDriver driver) {
        this.driver = driver;
        detailKajianVersiBaruObject = new DetailKajianVersiBaruObject(driver);
    }

    public WebElement getUserProfileLink() {
        return driver.findElement(detailKajianVersiBaruObject.getUserProfileLink());
    }

    public WebElement getUserProfileImage() {
        return driver.findElement(detailKajianVersiBaruObject.getUserProfileImage());
    }

    public WebElement getUserName() {
        return driver.findElement(detailKajianVersiBaruObject.getUserName());
    }

    public WebElement getKajianImage() {
        return driver.findElement(detailKajianVersiBaruObject.getKajianImage());
    }

    public WebElement getKajianTitle() {
        return driver.findElement(detailKajianVersiBaruObject.getKajianTitle());
    }

    public WebElement getKajianSpeaker() {
        return driver.findElement(detailKajianVersiBaruObject.getKajianSpeaker());
    }

    public WebElement getKajianDate() {
        return driver.findElement(detailKajianVersiBaruObject.getKajianDate());
    }

    public WebElement getKajianLocation() {
        return driver.findElement(detailKajianVersiBaruObject.getKajianLocation());
    }

    public WebElement getKajianDescription() {
        return driver.findElement(detailKajianVersiBaruObject.getKajianDescription());
    }

    public WebElement getDownloadKajianButton() {
        return driver.findElement(detailKajianVersiBaruObject.getDownloadKajianButton());
    }

    public WebElement getShareKajianButton() {
        return driver.findElement(detailKajianVersiBaruObject.getShareKajianButton());
    }

    public WebElement getUploadNewKajianButton() {
        return driver.findElement(detailKajianVersiBaruObject.getUploadNewKajianButton());
    }

    public WebElement getNewKajianHeading() {
        return driver.findElement(detailKajianVersiBaruObject.getNewKajianHeading());
    }

    public WebElement getNewKajianUserName() {
        return driver.findElement(detailKajianVersiBaruObject.getNewKajianUserName());
    }

    public WebElement getNewKajianUserImage() {
        return driver.findElement(detailKajianVersiBaruObject.getNewKajianUserImage());
    }

    public WebElement getNewKajianLink() {
        return driver.findElement(detailKajianVersiBaruObject.getNewKajianLink());
    }

    public WebElement getNewKajianArrowButton() {
        return driver.findElement(detailKajianVersiBaruObject.getNewKajianArrowButton());
    }

    public WebElement getKajianContentDifference() {
        return driver.findElement(detailKajianVersiBaruObject.getKajianContentDifference());
    }

    public WebElement getReferenceKajianLink() {
        return driver.findElement(detailKajianVersiBaruObject.getReferenceKajianLink());
    }

    public WebElement getSeeMoreButton() {
        return driver.findElement(detailKajianVersiBaruObject.getSeeMoreButton());
    }
}
