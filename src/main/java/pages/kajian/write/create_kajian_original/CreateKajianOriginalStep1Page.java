package pages.kajian.write.create_kajian_original;

import org.openqa.selenium.WebDriver;

public class CreateKajianOriginalStep1Page {
    protected WebDriver driver;
    CreateKajianOriginalStep1Object createKajianOriginalStep1Object;

    public CreateKajianOriginalStep1Page(WebDriver driver) {
        this.driver = driver;
        createKajianOriginalStep1Object = new CreateKajianOriginalStep1Object(driver);
    }

    public void enterTitle(String title) {
        driver.findElement(createKajianOriginalStep1Object.getTitleInput()).sendKeys(title);
    }

    public void enterPemateri(String pemateri) {
        driver.findElement(createKajianOriginalStep1Object.getPemateriInput()).sendKeys(pemateri);
    }

    public void enterTempat(String tempat) {
        driver.findElement(createKajianOriginalStep1Object.getTempatInput()).sendKeys(tempat);
    }

    public void enterTanggal(String tanggal) {
        driver.findElement(createKajianOriginalStep1Object.getTanggalInput()).sendKeys(tanggal);
    }

    public void enterDeskripsi(String deskripsi) {
        driver.findElement(createKajianOriginalStep1Object.getDeskripsiTextarea()).sendKeys(deskripsi);
    }

    public void uploadFoto(String fotoPath) {
        driver.findElement(createKajianOriginalStep1Object.getFotoInput()).sendKeys(fotoPath);
    }

    public void selectKategori(String kategori) {
        driver.findElement(createKajianOriginalStep1Object.getKategoriSelect()).sendKeys(kategori);
    }

    public void clickSubmit() {
        driver.findElement(createKajianOriginalStep1Object.getSubmitButton()).click();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
