package pages.kajian.write.create_kajian_original;

import org.openqa.selenium.WebDriver;

public class CreateKajianOriginalStep2Page {
    protected WebDriver driver;
    CreateKajianOriginalStep2Object createKajianOriginalStep2Object;

    public CreateKajianOriginalStep2Page(WebDriver driver) {
        this.driver = driver;
        createKajianOriginalStep2Object = new CreateKajianOriginalStep2Object(driver);
    }

    public void uploadDokumen(String dokumenPath) {
        driver.findElement(createKajianOriginalStep2Object.getDokumenInput()).sendKeys(dokumenPath);
    }

    public void enterKonten(String konten) {
        driver.findElement(createKajianOriginalStep2Object.getKontenTextarea()).sendKeys(konten);
    }

    public void clickSubmit() {
        driver.findElement(createKajianOriginalStep2Object.getSubmitButton()).click();
    }

    public void clickCancel() {
        driver.findElement(createKajianOriginalStep2Object.getCancelButton()).click();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
