package pages;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".addToCart.button.primary")
    public WebElement addToCartButton;

    @FindBy(css = ".qty-large")
    public WebElement setCount;

    @FindBy(css = ".successbox")
    public WebElement successBox;

}
