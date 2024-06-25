package pages.kajian.main.rekomendasi_kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RekomendasiKajianObject {
    WebDriver driver;

    public RekomendasiKajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getKajianRekomendasiHeading() {
        return By.id("title-kajian-rekomendasi");
    }

    public By getKategoriList() {
        return By.cssSelector(".list-rekomendasi .kategori");
    }

    public By getCategoryAddDropdown() {
        return By.id("category-add-dropdown");
    }

    public By getCategoryAddButton() {
        return By.id("dropdownMenuButton1");
    }

    public By getCategoryDropdownItems() {
        return By.cssSelector("#category-add-dropdown .dropdown-menu .dropdown-item");
    }

    public By getKajianRekomendasiResults() {
        return By.id("kajianRekomendasiResults");
    }

    public By getKajianItems() {
        return By.cssSelector(".kajian-item");
    }

    public By getKajianItemImage() {
        return By.cssSelector(".kajian-item .img-card-kajian");
    }

    public By getKajianItemTitle() {
        return By.cssSelector(".kajian-item .card-kajian-title");
    }

    public By getKajianItemDescription() {
        return By.cssSelector(".kajian-item .card-kajian-text");
    }

    public By getKajianItemCategory() {
        return By.cssSelector(".kajian-item .card-kajian-category");
    }

    public By getKajianItemViewMoreButton() {
        return By.cssSelector(".kajian-item .btn-view");
    }
}

