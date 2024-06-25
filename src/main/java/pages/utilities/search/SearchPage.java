package pages.utilities.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver;
    SearchObject searchObject;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        searchObject = new SearchObject(driver);
    }

    public WebElement getSearchResult(String keyword) {
        return driver.findElement(searchObject.getSearchResult(keyword));
    }
}
