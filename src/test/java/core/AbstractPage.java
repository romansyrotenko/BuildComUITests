package core;

import com.google.common.base.Function;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static core.ConfigTests.*;

public class AbstractPage {

    public WebDriver driver;
    public Wait wait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        this.wait = new FluentWait(driver)
                .withTimeout(FLUENT_WAIT_TIMEOUT, TimeUnit.SECONDS)
                .pollingEvery(FLUENT_WAIT_POLLING, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        PageFactory.initElements(driver, this);
    }

    public void open(String url) {
        driver.get(url);
    }

    public void waitElement(Function function) {
        wait.until(function);
    }

    public void setAttributeValue(WebElement elem, String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
        js.executeScript(scriptSetAttrValue, elem, "value", value);
    }

    public void selectItem(WebElement elem, String value) {
        WebElement Selectbox_roles = elem;
        Select select1 = new Select(Selectbox_roles);
        select1.selectByVisibleText(value);
    }

}
