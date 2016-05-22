package tests;

import core.ConfigTests;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.CartPage;
import pages.MainPage;
import pages.ProductPage;
import steps.CartPageSteps;
import steps.MainPageSteps;
import steps.ProductPageSteps;

import java.io.IOException;

public class BaseTest {

    public static WebDriver driver;
    public static MainPageSteps mainPage;
    public static ConfigTests configTests;
    public static ProductPageSteps productPage;
    public static CartPageSteps cartPage;


    @BeforeClass
    public static void initializeDriver() throws IOException {
        driver = new FirefoxDriver();
        new ConfigTests().loadProperties();
    }

    @BeforeClass
    public static void initializePages() throws IOException {
        mainPage = new MainPageSteps(new MainPage(driver));
        productPage = new ProductPageSteps(new ProductPage(driver));
        cartPage = new CartPageSteps(new CartPage(driver));
    }

    @After
    public void cleanAllCoockies() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }

}
