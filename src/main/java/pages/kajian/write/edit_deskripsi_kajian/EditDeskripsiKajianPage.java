package pages.kajian.write.edit_deskripsi_kajian;

import org.openqa.selenium.WebDriver;

public class EditDeskripsiKajianPage {
    protected WebDriver driver;
    EditDeskripsiKajianObject editDeskripsiKajianObject;

    public EditDeskripsiKajianPage(WebDriver driver) {
        this.driver = driver;
        editDeskripsiKajianObject = new EditDeskripsiKajianObject(driver);
    }

    public void clickEditButton() {
        driver.findElement(editDeskripsiKajianObject.getEditButton()).click();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
