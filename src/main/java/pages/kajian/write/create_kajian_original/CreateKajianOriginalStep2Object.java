package pages.kajian.write.create_kajian_original;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateKajianOriginalStep2Object {
    WebDriver driver;

    public CreateKajianOriginalStep2Object(WebDriver driver) {
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
