package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    WebDriver driver;
    // ---------- Personal Information ----------
    @FindBy(id = "client_active")
    WebElement chkActive;

    @FindBy(id = "client_name")
    WebElement txtClientName;

    @FindBy(id = "client_surname")
    WebElement txtClientSurname;

    // ---------- Address ----------
    @FindBy(id = "client_address_1")
    WebElement txtStreetAddress;

    @FindBy(id = "client_address_2")
    WebElement txtStreetAddress2;

    @FindBy(id = "client_city")
    WebElement txtCity;

    @FindBy(id = "client_state")
    WebElement txtState;

    @FindBy(id = "client_zip")
    WebElement txtZipCode;

    // ---------- Contact Information ----------
    @FindBy(id = "client_phone")
    WebElement txtPhone;

    @FindBy(id = "client_fax")
    WebElement txtFax;

    @FindBy(id = "client_mobile")
    WebElement txtMobile;

    @FindBy(id = "client_email")
    WebElement txtEmail;

    @FindBy(id = "client_web")
    WebElement txtWeb;

    @FindBy(id = "client_birthdate")
    WebElement txtBirthDate;

    // ---------- Taxes Information ----------
    @FindBy(id = "client_vat_id")
    WebElement txtVatId;

    @FindBy(id = "client_tax_code")
    WebElement txtTaxCode;

    // ---------- Buttons ----------
    @FindBy(id = "btn-submit")
    WebElement btnSave;

    @FindBy(id = "btn-cancel")
    WebElement btnCancel;

    public AddClient(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ---------- Personal Information ----------
    public void setActive(boolean active)
    {
        if (chkActive.isSelected() != active)
            chkActive.click();
    }

    public void setClientName(String name)
    {
        txtClientName.sendKeys(name);
    }

    public void setClientSurname(String surname)
    {
        txtClientSurname.sendKeys(surname);
    }

    // ---------- Address ----------
    public void setStreetAddress(String address)
    {
        txtStreetAddress.sendKeys(address);
    }

    public void setStreetAddress2(String address)
    {
        txtStreetAddress2.sendKeys(address);
    }

    public void setCity(String city)
    {
        txtCity.sendKeys(city);
    }

    public void setState(String state)
    {
        txtState.sendKeys(state);
    }

    public void setZipCode(String zip)
    {
        txtZipCode.sendKeys(zip);
    }

    // ---------- Contact Information ----------
    public void setPhone(String phone)
    {
        txtPhone.sendKeys(phone);
    }

    public void setFax(String fax)
    {
        txtFax.sendKeys(fax);
    }

    public void setMobile(String mobile)
    {
        txtMobile.sendKeys(mobile);
    }

    public void setEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void setWeb(String web)
    {
        txtWeb.sendKeys(web);
    }

    public void setBirthDate(String date)
    {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+date+"')",txtBirthDate);

    }
    // ---------- Taxes Information ----------
    public void setVatId(String vatId)
    {
        txtVatId.sendKeys(vatId);
    }

    public void setTaxCode(String taxCode)
    {
        txtTaxCode.sendKeys(taxCode);
    }

    // ---------- Buttons ----------
    public void clickSave()
    {
        btnSave.click();
    }

    public void clickCancel()
    {
        btnCancel.click();
    }
}
