package pages.kajian.write.create_kajian_original;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateKajianOriginalStep1Object {
    WebDriver driver;

    public CreateKajianOriginalStep1Object(WebDriver driver) {
        this.driver = driver;
    }

    public By getTitleInput() {
        return By.id("val_judul");
    }

    public By getPemateriInput() {
        return By.id("val-pemateri");
    }

    public By getTempatInput() {
        return By.id("val-tempat");
    }

    public By getTanggalInput() {
        return By.id("val-tanggal");
    }

    public By getDeskripsiTextarea() {
        return By.id("editor");
    }

    public By getFotoInput() {
        return By.id("foto-input");
    }

    public By getKategoriSelect() {
        return By.name("kategori");
    }

    public By getSubmitButton() {
        return By.xpath("//button[contains(text(), 'Lanjut')]");
    }
}