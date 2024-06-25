package pages.kajian.main.rekomendasi_kajian;

import org.openqa.selenium.WebDriver;

public class RekomendasiKajianPage {
    protected WebDriver driver;
    RekomendasiKajianObject rekomendasiKajianObject;

    public RekomendasiKajianPage(WebDriver driver) {
        this.driver = driver;
        rekomendasiKajianObject = new RekomendasiKajianObject(driver);
    }

    public String getKajianRekomendasiHeading() {
        return driver.findElement(rekomendasiKajianObject.getKajianRekomendasiHeading()).getText();
    }

    public void clickKategoriList() {
        driver.findElement(rekomendasiKajianObject.getKategoriList()).click();
    }

    public void clickCategoryAddDropdown() {
        driver.findElement(rekomendasiKajianObject.getCategoryAddDropdown()).click();
    }

    public void clickCategoryAddButton() {
        driver.findElement(rekomendasiKajianObject.getCategoryAddButton()).click();
    }

    public void clickCategoryDropdownItemByIndex(int index) {
        driver.findElements(rekomendasiKajianObject.getCategoryDropdownItems()).get(index).click();
    }

    public boolean isKajianRekomendasiResultsDisplayed() {
        return driver.findElement(rekomendasiKajianObject.getKajianRekomendasiResults()).isDisplayed();
    }

    public void clickKajianItemByIndex(int index) {
        driver.findElements(rekomendasiKajianObject.getKajianItems()).get(index).click();
    }

    public String getKajianItemTitleByIndex(int index) {
        return driver.findElements(rekomendasiKajianObject.getKajianItemTitle()).get(index).getText();
    }

    public String getKajianItemDescriptionByIndex(int index) {
        return driver.findElements(rekomendasiKajianObject.getKajianItemDescription()).get(index).getText();
    }

    public String getKajianItemCategoryByIndex(int index) {
        return driver.findElements(rekomendasiKajianObject.getKajianItemCategory()).get(index).getText();
    }

    public void clickKajianItemViewMoreButtonByIndex(int index) {
        driver.findElements(rekomendasiKajianObject.getKajianItemViewMoreButton()).get(index).click();
    }

    public boolean isKajianItemImageDisplayed(int index) {
        return driver.findElements(rekomendasiKajianObject.getKajianItemImage()).get(index).isDisplayed();
    }
}
