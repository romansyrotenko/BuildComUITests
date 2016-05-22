package steps;

import pages.ProductPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductPageSteps {

    ProductPage productPage;

    public ProductPageSteps(ProductPage productPage) {
        this.productPage = productPage;
    }
    
    public void addProductToCart(int count) {
        productPage.setAttributeValue(productPage.setCount,Integer.toString(count));
        productPage.waitElement(elementToBeClickable(productPage.addToCartButton));
        productPage.addToCartButton.click();
        productPage.waitElement(visibilityOf(productPage.successBox));
    }

}
