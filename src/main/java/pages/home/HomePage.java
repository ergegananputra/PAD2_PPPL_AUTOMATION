package pages.home;

import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;
    HomeObject homeObject;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        homeObject = new HomeObject(driver);
    }

    public void clickCreateKajianButton() {
        driver.findElement(homeObject.getCreateKajianButton()).click();
    }

    public void clickCategoryAddButton() {
        driver.findElement(homeObject.getCategoryAddButton()).click();
    }

    public void clickCategoryAddDropdown() {
        driver.findElement(homeObject.getCategoryAddDropdown()).click();
    }

    public void selectCategoryDropdownItem(int index) {
        driver.findElements(homeObject.getCategoryDropdownItems()).get(index).click();
    }

    public boolean isKajianRekomendasiHeadingVisible() {
        return driver.findElement(homeObject.getKajianRekomendasiHeading()).isDisplayed();
    }

    public boolean isKategoriListVisible() {
        return driver.findElement(homeObject.getKategoriList()).isDisplayed();
    }

    public boolean isKajianRekomendasiResultsVisible() {
        return driver.findElement(homeObject.getKajianRekomendasiResults()).isDisplayed();
    }

    public boolean isKajianItemsVisible() {
        return driver.findElement(homeObject.getKajianItems()).isDisplayed();
    }

    public void clickKajianItemViewMoreButton(int index) {
        driver.findElements(homeObject.getKajianItemViewMoreButton()).get(index).click();
    }

    public String getKajianItemTitle(int index) {
        return driver.findElements(homeObject.getKajianItemTitle()).get(index).getText();
    }

    public String getKajianItemDescription(int index) {
        return driver.findElements(homeObject.getKajianItemDescription()).get(index).getText();
    }

    public String getKajianItemCategory(int index) {
        return driver.findElements(homeObject.getKajianItemCategory()).get(index).getText();
    }

    public boolean isCardTitleByIndexTerkiniVisible(int index) {
        return driver.findElement(homeObject.getCardTitleByIndexTerkini(index)).isDisplayed();
    }

    public boolean isCardDescriptionByIndexTerkiniVisible(int index) {
        return driver.findElement(homeObject.getCardDescriptionByIndexTerkini(index)).isDisplayed();
    }

    public void clickLihatSelengkapnyaLinkByIndexTerkini(int index) {
        driver.findElement(homeObject.getLihatSelengkapnyaLinkByIndexTerkini(index)).click();
    }

    public boolean isSearchResultVisible(String keyword) {
        return driver.findElement(homeObject.getSearchResult(keyword)).isDisplayed();
    }

    public boolean isKajianItemImageVisible(int index) {
        return driver.findElements(homeObject.getKajianItemImage()).get(index).isDisplayed();
    }
}
