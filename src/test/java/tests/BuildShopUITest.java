package tests;

import org.junit.Test;

import static core.ConfigTests.*;

public class BuildShopUITest extends BaseTest{

    @Test
    public void testTotalAmountAndTax() {
        searchAndAddtoCartProduct(PRODUCT_PROPERTY_SUEDE + " " + PRODUCT_ONE, 1);
        searchAndAddtoCartProduct(PRODUCT_PROPERTY_CASHMERE + " " + PRODUCT_ONE, 1);
        searchAndAddtoCartProduct(PRODUCT_TWO, 2);
        cartPage.open();
        cartPage.startCheckout();
        cartPage.fillShippingAndPaymentInformation();
        cartPage.shouldBeTaxCorrect();
        cartPage.shouldBeGrandTotalAmountCorrect();
    }

    public void searchAndAddtoCartProduct(String productName, int amount) {
        mainPage.open();
        mainPage.searchProduct(productName);
        productPage.addProductToCart(amount);
    }
}
