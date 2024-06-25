package pages.login;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginObject loginObject;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginObject = new LoginObject(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void putEmail(String email) {
        driver.findElement(loginObject.getTextInputEmail()).sendKeys(email);
    }

    public void putPassword(String password) {
        driver.findElement(loginObject.getTextInputPassword()).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(loginObject.getButtonSubmit()).click();
    }

}