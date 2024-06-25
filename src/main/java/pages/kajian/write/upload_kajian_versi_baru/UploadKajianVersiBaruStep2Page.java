package pages.kajian.write.upload_kajian_versi_baru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadKajianVersiBaruStep2Page {
    WebDriver driver;
    UploadKajianVersiBaruStep2Object uploadKajianVersiBaruStep2Object;

    public UploadKajianVersiBaruStep2Page(WebDriver driver) {
        this.driver = driver;
        uploadKajianVersiBaruStep2Object = new UploadKajianVersiBaruStep2Object(driver);
    }

    public WebElement getDokumenInput() {
        return driver.findElement(uploadKajianVersiBaruStep2Object.getDokumenInput());
    }

    public WebElement getKontenTextarea() {
        return driver.findElement(uploadKajianVersiBaruStep2Object.getKontenTextarea());
    }

    public WebElement getSubmitButton() {
        return driver.findElement(uploadKajianVersiBaruStep2Object.getSubmitButton());
    }

    public WebElement getCancelButton() {
        return driver.findElement(uploadKajianVersiBaruStep2Object.getCancelButton());
    }
}
