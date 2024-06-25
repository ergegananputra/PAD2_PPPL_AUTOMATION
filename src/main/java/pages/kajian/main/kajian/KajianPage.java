package pages.kajian.main.kajian;

import org.openqa.selenium.WebDriver;
import pages.kajian.main.kajian.KajianObject;

public class KajianPage {
    protected WebDriver driver;
    KajianObject kajianObject;

    public KajianPage(WebDriver driver) {
        this.driver = driver;
        kajianObject = new KajianObject(driver);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
    public void searchKajian(String keyword) {
        driver.findElement(kajianObject.getSearchResult(keyword)).click();
    }

    public void clickCreateKajianButton() {
        driver.findElement(kajianObject.getCreateKajianButton()).click();
    }

    public void clickLihatSemuaLink() {
        driver.findElement(kajianObject.getLihatSemuaLink()).click();
    }

    public void clickNextButtonImage() {
        driver.findElement(kajianObject.getNextButtonImage()).click();
    }

    public String getCardTitleByIndex(int index) {
        return driver.findElement(kajianObject.getCardTitleByIndex(index)).getText();
    }

    public String getCardDescriptionByIndex(int index) {
        return driver.findElement(kajianObject.getCardDescriptionByIndex(index)).getText();
    }

    public void clickLihatSelengkapnyaLinkByIndex(int index) {
        driver.findElement(kajianObject.getLihatSelengkapnyaLinkByIndex(index)).click();
    }

    public String getKajianRekomendasiHeading() {
        return driver.findElement(kajianObject.getKajianRekomendasiHeading()).getText();
    }

    public void clickKategoriList() {
        driver.findElement(kajianObject.getKategoriList()).click();
    }

    public void clickCategoryAddDropdown() {
        driver.findElement(kajianObject.getCategoryAddDropdown()).click();
    }

    public void clickCategoryAddButton() {
        driver.findElement(kajianObject.getCategoryAddButton()).click();
    }

    public void clickCategoryDropdownItemByIndex(int index) {
        driver.findElements(kajianObject.getCategoryDropdownItems()).get(index).click();
    }

    public boolean isKajianRekomendasiResultsDisplayed() {
        return driver.findElement(kajianObject.getKajianRekomendasiResults()).isDisplayed();
    }

    public void clickKajianItemByIndex(int index) {
        driver.findElements(kajianObject.getKajianItems()).get(index).click();
    }

    public String getKajianItemTitleByIndex(int index) {
        return driver.findElements(kajianObject.getKajianItemTitle()).get(index).getText();
    }

    public String getKajianItemDescriptionByIndex(int index) {
        return driver.findElements(kajianObject.getKajianItemDescription()).get(index).getText();
    }

    public String getKajianItemCategoryByIndex(int index) {
        return driver.findElements(kajianObject.getKajianItemCategory()).get(index).getText();
    }

    public void clickKajianItemViewMoreButtonByIndex(int index) {
        driver.findElements(kajianObject.getKajianItemViewMoreButton()).get(index).click();
    }

    public boolean isKajianItemImageDisplayed(int index) {
        return driver.findElements(kajianObject.getKajianItemImage()).get(index).isDisplayed();
    }

    public String getCardTitleByIndexTerkini(int index) {
        return driver.findElement(kajianObject.getCardTitleByIndexTerkini(index)).getText();
    }

    public String getCardDescriptionByIndexTerkini(int index) {
        return driver.findElement(kajianObject.getCardDescriptionByIndexTerkini(index)).getText();
    }

    public void clickLihatSelengkapnyaLinkByIndexTerkini(int index) {
        driver.findElement(kajianObject.getLihatSelengkapnyaLinkByIndexTerkini(index)).click();
    }
}
