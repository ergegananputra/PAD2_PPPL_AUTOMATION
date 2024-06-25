package pages.kajian.write.upload_kajian_versi_baru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadKajianVersiBaruStep2Object {
    WebDriver driver;
    public UploadKajianVersiBaruStep2Object(WebDriver driver) {
        this.driver = driver;
    }

    public By getDokumenInput() {
        return By.id("dokumen-input");
    }

    public By getKontenTextarea() {
        return By.id("editor");
    }

    public By getSubmitButton() {
        return By.xpath("//button[contains(text(), 'Simpan Konten')]");
    }

    public By getCancelButton() {
        return By.xpath("//a[contains(text(), 'Batal')]");
    }
}
