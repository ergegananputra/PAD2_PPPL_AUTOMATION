package pages.kajian.admin.delete_kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteKajianObject {
    WebDriver driver;

    public DeleteKajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getDeleteKajianButton(int id) {
        return By.xpath("//tr[td[contains(text(), '" + id + "')]]//button[@title='Delete']");
    }
}