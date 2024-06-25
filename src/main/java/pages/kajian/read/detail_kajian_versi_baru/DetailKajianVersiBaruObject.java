package pages.kajian.read.detail_kajian_versi_baru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailKajianVersiBaruObject {
    WebDriver driver;

    public DetailKajianVersiBaruObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getUserProfileLink() {
        return By.xpath("//div[@class='account-detail']//a[contains(@href, '/profile/akun_pengguna')]");
    }

    public By getUserProfileImage() {
        return By.xpath("//div[@class='account-detail']//img[@class='pp-account']");
    }

    public By getUserName() {
        return By.xpath("//div[@class='name-account']//div[@class='nama']");
    }

    public By getKajianImage() {
        return By.xpath("//div[@class='content']//img[@class='img-fluid']");
    }

    public By getKajianTitle() {
        return By.xpath("//div[@class='desc-kajian']//div[text()='Judul']/following-sibling::div/p");
    }

    public By getKajianSpeaker() {
        return By.xpath("//div[@class='desc-kajian']//div[text()='Pemateri']/following-sibling::div/p");
    }

    public By getKajianDate() {
        return By.xpath("//div[@class='desc-kajian']//div[text()='Tanggal']/following-sibling::div/p");
    }

    public By getKajianLocation() {
        return By.xpath("//div[@class='desc-kajian']//div[text()='Lokasi']/following-sibling::div/p");
    }

    public By getKajianDescription() {
        return By.xpath("//div[@class='desc-kajian']//div[text()='Deskripsi']/following-sibling::p");
    }

    public By getDownloadKajianButton() {
        return By.xpath("//button[contains(@class, 'btn-download-share-kajian') and contains(text(), 'Unduh File Kajian')]");
    }

    public By getShareKajianButton() {
        return By.xpath("//button[contains(@class, 'btn-download-share-kajian') and contains(text(), 'Bagikan Tautan Kajian')]");
    }

    public By getUploadNewKajianButton() {
        return By.xpath("//button[contains(@class, 'btn-green-submit') and contains(text(), 'Unggah Kajian Versi Baru')]");
    }

    public By getNewKajianHeading() {
        return By.xpath("//div[@class='card-body-user']//h1[contains(text(), 'Kajian Versi Baru')]");
    }

    public By getNewKajianUserName() {
        return By.xpath("//div[@class='card-body-user']//p[@class='username-kajian-baru']");
    }

    public By getNewKajianUserImage() {
        return By.xpath("//div[@class='card-body-user']//div[@class='col-md-3']//img");
    }

    public By getNewKajianLink() {
        return By.xpath("//div[@class='card-body-user']//a[contains(@href, '/kajian/')]");
    }

    public By getNewKajianArrowButton() {
        return By.xpath("//div[@class='card-body-user']//img[contains(@src, 'arrow-right-square.svg')]");
    }

    public By getKajianContentDifference() {
        return By.id("content_different");
    }

    public By getReferenceKajianLink() {
        return By.xpath("//a[@class='reference_link']");
    }

    public By getSeeMoreButton() {
        return By.id("seeMoreButton");
    }
}
