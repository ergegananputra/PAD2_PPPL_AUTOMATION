package pages.kajian.admin.detail_kajian;

import org.openqa.selenium.WebDriver;
import pages.admin.dasboard.AdminDashboardPage;

public class DetailKajianPage extends AdminDashboardPage {
    DetailKajianObject detailKajianObject;

    public DetailKajianPage(WebDriver driver) {
        super(driver);
        detailKajianObject = new DetailKajianObject(driver);
    }

    public boolean isUserProfileLinkVisible() {
        return driver.findElement(detailKajianObject.getUserProfileLink()).isDisplayed();
    }

    public boolean isUserProfileImageVisible() {
        return driver.findElement(detailKajianObject.getUserProfileImage()).isDisplayed();
    }

    public boolean isUserNameVisible() {
        return driver.findElement(detailKajianObject.getUserName()).isDisplayed();
    }

    public boolean isKajianImageVisible() {
        return driver.findElement(detailKajianObject.getKajianImage()).isDisplayed();
    }

    public boolean isKajianTitleVisible() {
        return driver.findElement(detailKajianObject.getKajianTitle()).isDisplayed();
    }

    public boolean isKajianSpeakerVisible() {
        return driver.findElement(detailKajianObject.getKajianSpeaker()).isDisplayed();
    }

    public boolean isKajianDateVisible() {
        return driver.findElement(detailKajianObject.getKajianDate()).isDisplayed();
    }

    public boolean isKajianLocationVisible() {
        return driver.findElement(detailKajianObject.getKajianLocation()).isDisplayed();
    }

    public boolean isKajianDescriptionVisible() {
        return driver.findElement(detailKajianObject.getKajianDescription()).isDisplayed();
    }

    public void clickDownloadKajianButton() {
        driver.findElement(detailKajianObject.getDownloadKajianButton()).click();
    }

    public void clickShareKajianButton() {
        driver.findElement(detailKajianObject.getShareKajianButton()).click();
    }

    public void clickUploadNewKajianButton() {
        driver.findElement(detailKajianObject.getUploadNewKajianButton()).click();
    }

    public boolean isNewKajianHeadingVisible() {
        return driver.findElement(detailKajianObject.getNewKajianHeading()).isDisplayed();
    }

    public boolean isNewKajianUserNameVisible() {
        return driver.findElement(detailKajianObject.getNewKajianUserName()).isDisplayed();
    }

    public boolean isNewKajianUserImageVisible() {
        return driver.findElement(detailKajianObject.getNewKajianUserImage()).isDisplayed();
    }

    public boolean isNewKajianLinkVisible() {
        return driver.findElement(detailKajianObject.getNewKajianLink()).isDisplayed();
    }

    public void clickNewKajianArrowButton() {
        driver.findElement(detailKajianObject.getNewKajianArrowButton()).click();
    }
}
