package pages.about;

import org.openqa.selenium.WebDriver;

public class AboutPage {
    WebDriver driver;
    AboutObject aboutObject;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
        aboutObject = new AboutObject(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void searchKajian(String keyword) {
        driver.findElement(aboutObject.getSearchResult(keyword)).click();
    }

    public void clickCreateKajianButton() {
        driver.findElement(aboutObject.getCreateKajianButton()).click();
    }

    public void clickLihatSemuaLink() {
        driver.findElement(aboutObject.getLihatSemuaLink()).click();
    }

    public void clickNextButtonImage() {
        driver.findElement(aboutObject.getNextButtonImage()).click();
    }

    public String getCardTitleByIndex(int index) {
        return driver.findElement(aboutObject.getCardTitleByIndex(index)).getText();
    }

    public String getCardDescriptionByIndex(int index) {
        return driver.findElement(aboutObject.getCardDescriptionByIndex(index)).getText();
    }

    public void clickLihatSelengkapnyaLinkByIndex(int index) {
        driver.findElement(aboutObject.getLihatSelengkapnyaLinkByIndex(index)).click();
    }
}
