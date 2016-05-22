package steps;

import pages.CartPage;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static core.ConfigTests.*;
import static java.lang.Float.parseFloat;
import static junit.framework.TestCase.assertEquals;

public class CartPageSteps {

    CartPage cartPage;

    public CartPageSteps(CartPage cartPage) {
        this.cartPage = cartPage;
    }

    public void open() {
        cartPage.open(BASE_URL + CART_PAGE_URL);
    }

    public void startCheckout() {
        cartPage.checkoutButton.click();
        cartPage.checkOutAsGuestButton.click();
    }

    public void fillShippingAndPaymentInformation() {
        cartPage.firstName.sendKeys(FIRST_NAME);
        cartPage.lastName.sendKeys(LAST_NAME);
        cartPage.streetAdress.sendKeys(STREET_ADRESS);
        cartPage.zipCode.sendKeys(ZIP_CODE);
        cartPage.city.sendKeys(CITY);
        cartPage.phoneNumber.click();
        cartPage.phoneNumber.sendKeys(PHONE_NUMBER);
        cartPage.selectItem(cartPage.shippingState, STATE);
        cartPage.emailAdress.sendKeys(EMAIL_ADRESS);
        cartPage.creditCardNumber.sendKeys(CREDIT_CARD_NUMBER);
        cartPage.selectItem(cartPage.creditCardMonth, CREDIT_CARD_MONTH);
        cartPage.selectItem(cartPage.creditCardYear, CREDIT_CARD_YEAR);
        cartPage.creditCardName.sendKeys(CREDIT_CARD_NAME);
        cartPage.creditCardCVV2.sendKeys(CREDIC_CARD_CVV2);
        cartPage.reviewOrderButton.click();
    }

    public void shouldBeTaxCorrect() {
        assertEquals(calcTax(), getTaxAmount());
    }

    public void shouldBeGrandTotalAmountCorrect() {
        assertEquals(getSubTotalAmount() + calcTax(), getGrandTotalAmount());
    }

    private float getGrandTotalAmount() {
        String grandTotalAmountString = cartPage.grandTotalAmount.getText();
        return parseFloat(grandTotalAmountString.replaceAll("[^\\d+\\.]", ""));
    }

    private float getTaxAmount() {
        return parseFloat(cartPage.taxAmount.getAttribute("data-tax"));
    }

    private float getSubTotalAmount() {
        return parseFloat(cartPage.subTotalAmount.getAttribute("data-subtotal"));
    }

    private float calcTax() {
        return new BigDecimal(getSubTotalAmount() * 7.5f / 100f).setScale(2, RoundingMode.UP).floatValue();
    }
}
