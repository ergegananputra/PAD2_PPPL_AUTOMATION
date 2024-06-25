package pages.kajian.write.automated_commit_message;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomatedCommitMessageObject {
    WebDriver driver;

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
