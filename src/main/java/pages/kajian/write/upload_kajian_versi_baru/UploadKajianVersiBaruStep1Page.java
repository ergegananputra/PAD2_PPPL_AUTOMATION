package pages.kajian.write.upload_kajian_versi_baru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadKajianVersiBaruStep1Page {
    WebDriver driver;
    UploadKajianVersiBaruStep1Object uploadKajianVersiBaruStep1Object;

    public UploadKajianVersiBaruStep1Page(WebDriver driver) {
        this.driver = driver;
        uploadKajianVersiBaruStep1Object = new UploadKajianVersiBaruStep1Object(driver);
    }

    public WebElement getJudulInput() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getJudulInput());
    }

    public WebElement getPemateriInput() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getPemateriInput());
    }

    public WebElement getTempatInput() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getTempatInput());
    }

    public WebElement getTanggalInput() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getTanggalInput());
    }

    public WebElement getDeskripsiTextarea() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getDeskripsiTextarea());
    }

    public WebElement getFotoInput() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getFotoInput());
    }

    public WebElement getKategoriSelect() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getKategoriSelect());
    }

    public WebElement getSubmitButton() {
        return driver.findElement(uploadKajianVersiBaruStep1Object.getSubmitButton());
    }
}
