package pages;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".button.primary.icon-secure")
    public WebElement checkoutButton;

    @FindBy(name = "guestLoginSubmit")
    public WebElement checkOutAsGuestButton;

    @FindBy(id = "shippingfirstname")
    public WebElement firstName;

    @FindBy(id = "shippinglastname")
    public WebElement lastName;

    @FindBy(id = "shippingaddress1")
    public WebElement streetAdress;

    @FindBy(id = "shippingpostalcode")
    public WebElement zipCode;

    @FindBy(id = "shippingcity")
    public WebElement city;

    @FindBy(id = "shippingphonenumber")
    public WebElement phoneNumber;

    @FindBy(id = "emailAddress")
    public WebElement emailAdress;

    @FindBy(id = "creditCardNumber")
    public WebElement creditCardNumber;

    @FindBy(id = "creditcardname")
    public WebElement creditCardName;

    @FindBy(id = "creditCardCVV2")
    public WebElement creditCardCVV2;

    @FindBy(css = "#creditcard .js-checkout-review")
    public WebElement reviewOrderButton;

    @FindBy(id = "shippingstate_1")
    public WebElement shippingState;

    @FindBy(id = "creditCardMonth")
    public WebElement creditCardMonth;

    @FindBy(id = "creditCardYear")
    public WebElement creditCardYear;

    @FindBy(id = "subtotalamount")
    public WebElement subTotalAmount;

    @FindBy(id = "taxAmount")
    public WebElement taxAmount;

    @FindBy(id = "grandtotalamount")
    public WebElement grandTotalAmount;

}
