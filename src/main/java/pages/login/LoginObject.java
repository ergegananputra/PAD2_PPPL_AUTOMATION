package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;

    public LoginObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTextInputEmail() {
        return By.id("email");
    }

    public By getTextInputPassword() {
        return By.id("password");
    }

    public By getButtonSubmit() {
        return By.xpath("//button[contains(text(), 'Masuk')]");
    }

    /**
     * TODO: Add more elements
     */
}