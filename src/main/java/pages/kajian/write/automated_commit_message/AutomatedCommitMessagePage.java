package pages.kajian.write.automated_commit_message;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomatedCommitMessagePage {
    WebDriver driver;
    AutomatedCommitMessageObject automatedCommitMessageObject;

    public AutomatedCommitMessagePage(WebDriver driver) {
        this.driver = driver;
        automatedCommitMessageObject = new AutomatedCommitMessageObject();
    }

    public WebElement getKontenTextarea() {
        return driver.findElement(automatedCommitMessageObject.getKontenTextarea());
    }

    public WebElement getSubmitButton() {
        return driver.findElement(automatedCommitMessageObject.getSubmitButton());
    }

    public WebElement getCancelButton() {
        return driver.findElement(automatedCommitMessageObject.getCancelButton());
    }
}
