package pages.kajian.write.delete_kajian;

import org.openqa.selenium.WebDriver;

public class DeleteKajianPage {
    protected WebDriver driver;
    DeleteKajianObject deleteKajianObject;

    public DeleteKajianPage(WebDriver driver) {
        this.driver = driver;
        deleteKajianObject = new DeleteKajianObject(driver);
    }

    public void clickDeleteButton() {
        driver.findElement(deleteKajianObject.getDeleteButton()).click();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
