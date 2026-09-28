package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    // ---------- Mobile / small-screen toggle ----------
    @FindBy(xpath = "//button[contains(@class,'navbar-toggle')]")
    WebElement btnMenuToggle;

    // ---------- Dashboard ----------
    @FindBy(xpath = "//a[@class='hidden-md' and normalize-space()='Dashboard']")
    WebElement lnkDashboard;

    // ---------- Clients ----------
    @FindBy(xpath = "//span[normalize-space()='Clients']")
    WebElement mnuClients;

    @FindBy(linkText = "Add Client")
    WebElement lnkAddClient;

    @FindBy(linkText = "View Clients")
    WebElement lnkViewClients;

    // ---------- Quotes ----------
    @FindBy(xpath = "//span[normalize-space()='Quotes']")
    WebElement mnuQuotes;

    @FindBy(xpath = "//a[@class='create-quote']")
    WebElement lnkCreateQuote;

    @FindBy(linkText = "View Quotes")
    WebElement lnkViewQuotes;

    // ---------- Invoices ----------
    @FindBy(xpath = "//span[normalize-space()='Invoices']")
    WebElement mnuInvoices;

    @FindBy(xpath = "//a[@class='create-invoice']")
    WebElement lnkCreateInvoice;

    @FindBy(linkText = "View Invoices")
    WebElement lnkViewInvoices;

    @FindBy(linkText = "View Recurring Invoices")
    WebElement lnkViewRecurringInvoices;

    // ---------- Payments ----------
    @FindBy(xpath = "//span[normalize-space()='Payments']")
    WebElement mnuPayments;

    @FindBy(linkText = "Enter Payment")
    WebElement lnkEnterPayment;

    @FindBy(linkText = "View Payments")
    WebElement lnkViewPayments;

    @FindBy(linkText = "View Online Payment Logs")
    WebElement lnkViewOnlinePaymentLogs;

    // ---------- Products ----------
    @FindBy(xpath = "//span[normalize-space()='Products']")
    WebElement mnuProducts;

    @FindBy(linkText = "Create product")
    WebElement lnkCreateProduct;

    @FindBy(linkText = "View Products")
    WebElement lnkViewProducts;

    @FindBy(linkText = "View Product Families")
    WebElement lnkViewProductFamilies;

    @FindBy(linkText = "View Product Units")
    WebElement lnkViewProductUnits;

    // ---------- Tasks ----------
    @FindBy(xpath = "//span[normalize-space()='Tasks']")
    WebElement mnuTasks;

    @FindBy(linkText = "Create Task")
    WebElement lnkCreateTask;

    @FindBy(linkText = "View Tasks")
    WebElement lnkViewTasks;

    @FindBy(linkText = "Create Project")
    WebElement lnkCreateProject;

    @FindBy(linkText = "View Projects")
    WebElement lnkViewProjects;

    // ---------- Reports ----------
    @FindBy(xpath = "//span[normalize-space()='Reports']")
    WebElement mnuReports;

    @FindBy(linkText = "Invoice Aging")
    WebElement lnkInvoiceAging;

    @FindBy(linkText = "Payment History")
    WebElement lnkPaymentHistory;

    @FindBy(linkText = "Sales by Client")
    WebElement lnkSalesByClient;

    @FindBy(linkText = "Sales by Date")
    WebElement lnkSalesByDate;

    // ---------- Right side: Documentation, Settings, Profile, Logout ----------
    @FindBy(xpath = "//a[@data-original-title='Documentation']")
    WebElement lnkDocumentation;

    @FindBy(xpath = "//a[@data-original-title='Settings']")
    WebElement mnuSettings;

    @FindBy(linkText = "Custom Fields")
    WebElement lnkCustomFields;

    @FindBy(linkText = "Email Templates")
    WebElement lnkEmailTemplates;

    @FindBy(linkText = "Invoice Groups")
    WebElement lnkInvoiceGroups;

    @FindBy(linkText = "Invoice Archive")
    WebElement lnkInvoiceArchive;

    @FindBy(linkText = "Payment Methods")
    WebElement lnkPaymentMethods;

    @FindBy(linkText = "Tax Rates")
    WebElement lnkTaxRates;

    @FindBy(linkText = "User Accounts")
    WebElement lnkUserAccounts;

    @FindBy(linkText = "System Settings")
    WebElement lnkSystemSettings;

    @FindBy(linkText = "Import Data")
    WebElement lnkImportData;

    @FindBy(xpath = "//a[contains(@href,'users/form')]")
    WebElement lnkUserProfile;

    @FindBy(xpath = "//a[contains(@class,'logout')]")
    WebElement lnkLogout;

    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    // ---------- Toggle ----------
    public void clickMenuToggle()
    {
        btnMenuToggle.click();
    }

    // ---------- Dashboard ----------
    public void clickDashboard()
    {
        lnkDashboard.click();
    }

    // ---------- Clients ----------
    public void clickAddClient()
    {
        mnuClients.click();
        lnkAddClient.click();
    }

    public void clickViewClients()
    {
        mnuClients.click();
        lnkViewClients.click();
    }

    // ---------- Quotes ----------
    public void clickCreateQuote()
    {
        mnuQuotes.click();
        lnkCreateQuote.click();
    }

    public void clickViewQuotes()
    {
        mnuQuotes.click();
        lnkViewQuotes.click();
    }

    // ---------- Invoices ----------
    public void clickCreateInvoice()
    {
        mnuInvoices.click();
        lnkCreateInvoice.click();
    }

    public void clickViewInvoices()
    {
        mnuInvoices.click();
        lnkViewInvoices.click();
    }

    public void clickViewRecurringInvoices()
    {
        mnuInvoices.click();
        lnkViewRecurringInvoices.click();
    }

    // ---------- Payments ----------
    public void clickEnterPayment()
    {
        mnuPayments.click();
        lnkEnterPayment.click();
    }

    public void clickViewPayments()
    {
        mnuPayments.click();
        lnkViewPayments.click();
    }

    public void clickViewOnlinePaymentLogs()
    {
        mnuPayments.click();
        lnkViewOnlinePaymentLogs.click();
    }

    // ---------- Products ----------
    public void clickCreateProduct()
    {
        mnuProducts.click();
        lnkCreateProduct.click();
    }

    public void clickViewProducts()
    {
        mnuProducts.click();
        lnkViewProducts.click();
    }

    public void clickViewProductFamilies()
    {
        mnuProducts.click();
        lnkViewProductFamilies.click();
    }

    public void clickViewProductUnits()
    {
        mnuProducts.click();
        lnkViewProductUnits.click();
    }

    // ---------- Tasks ----------
    public void clickCreateTask()
    {
        mnuTasks.click();
        lnkCreateTask.click();
    }

    public void clickViewTasks()
    {
        mnuTasks.click();
        lnkViewTasks.click();
    }

    public void clickCreateProject()
    {
        mnuTasks.click();
        lnkCreateProject.click();
    }

    public void clickViewProjects()
    {
        mnuTasks.click();
        lnkViewProjects.click();
    }

    // ---------- Reports ----------
    public void clickInvoiceAging()
    {
        mnuReports.click();
        lnkInvoiceAging.click();
    }

    public void clickPaymentHistory()
    {
        mnuReports.click();
        lnkPaymentHistory.click();
    }

    public void clickSalesByClient()
    {
        mnuReports.click();
        lnkSalesByClient.click();
    }

    public void clickSalesByDate()
    {
        mnuReports.click();
        lnkSalesByDate.click();
    }

    // ---------- Settings ----------
    public void clickCustomFields()
    {
        mnuSettings.click();
        lnkCustomFields.click();
    }

    public void clickEmailTemplates()
    {
        mnuSettings.click();
        lnkEmailTemplates.click();
    }

    public void clickInvoiceGroups()
    {
        mnuSettings.click();
        lnkInvoiceGroups.click();
    }

    public void clickInvoiceArchive()
    {
        mnuSettings.click();
        lnkInvoiceArchive.click();
    }

    public void clickPaymentMethods()
    {
        mnuSettings.click();
        lnkPaymentMethods.click();
    }

    public void clickTaxRates()
    {
        mnuSettings.click();
        lnkTaxRates.click();
    }

    public void clickUserAccounts()
    {
        mnuSettings.click();
        lnkUserAccounts.click();
    }

    public void clickSystemSettings()
    {
        mnuSettings.click();
        lnkSystemSettings.click();
    }

    public void clickImportData()
    {
        mnuSettings.click();
        lnkImportData.click();
    }

    // ---------- Right-side icons ----------
    public void clickDocumentation()
    {
        lnkDocumentation.click();
    }

    public void clickUserProfile()
    {
        lnkUserProfile.click();
    }

    public void clickLogout()
    {
        lnkLogout.click();
    }
}
