package core;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigTests {

    public static int IMPLICITY_WAIT_TIME;
    public static int FLUENT_WAIT_TIMEOUT;
    public static int FLUENT_WAIT_POLLING;
    public static String BASE_URL;
    public static String CART_PAGE_URL;
    public static String PRODUCT_PAGE_URL;
    public static String PRODUCT_ONE;
    public static String PRODUCT_TWO;
    public static String PRODUCT_PROPERTY_SUEDE;
    public static String PRODUCT_PROPERTY_CASHMERE;
    public static String FIRST_NAME;
    public static String LAST_NAME;
    public static String STREET_ADRESS;
    public static String ZIP_CODE;
    public static String CITY;
    public static String  PHONE_NUMBER;
    public static String STATE;
    public static String EMAIL_ADRESS;
    public static String CREDIT_CARD_NUMBER;
    public static String CREDIT_CARD_MONTH;
    public static String CREDIT_CARD_YEAR;
    public static String CREDIT_CARD_NAME;
    public static String CREDIC_CARD_CVV2;

    public void loadProperties() throws IOException {
        Properties properties = new Properties();
        File resourcesDirectory = new File("src/main/resources/config.properties");
        File file = new File(resourcesDirectory.getAbsolutePath());
        properties.load(new FileReader(file));

        this.IMPLICITY_WAIT_TIME = Integer.parseInt(properties.getProperty("IMPLICITY_WAIT_TIME"));
        this.FLUENT_WAIT_TIMEOUT = Integer.parseInt(properties.getProperty("FLUENT_WAIT_TIMEOUT"));
        this.FLUENT_WAIT_POLLING = Integer.parseInt(properties.getProperty("FLUENT_WAIT_POLLING"));
        this.BASE_URL = properties.getProperty("BASE_URL");
        this.CART_PAGE_URL = properties.getProperty("CART_PAGE_URL");
        this.PRODUCT_PAGE_URL = properties.getProperty("PRODUCT_PAGE_URL");
        this.PRODUCT_ONE = properties.getProperty("PRODUCT_NAME_ONE");
        this.PRODUCT_TWO = properties.getProperty("PRODUCT_NAME_TWO");
        this.PRODUCT_PROPERTY_SUEDE = properties.getProperty("PRODUCT_PROPERTY_ONE");
        this.PRODUCT_PROPERTY_CASHMERE = properties.getProperty("PRODUCT_PROPERTY_TWO");
        this.FIRST_NAME = properties.getProperty("FIRST_NAME");
        this.LAST_NAME = properties.getProperty("LAST_NAME");
        this.STREET_ADRESS = properties.getProperty("STREET_ADRESS");
        this.ZIP_CODE = properties.getProperty("ZIP_CODE");
        this.CITY = properties.getProperty("CITY");
        this.PHONE_NUMBER = properties.getProperty("PHONE_NUMBER");
        this.STATE = properties.getProperty("STATE");
        this.EMAIL_ADRESS = properties.getProperty("EMAIL_ADRESS");
        this.CREDIT_CARD_NUMBER = properties.getProperty("CREDIT_CARD_NUMBER");
        this.CREDIT_CARD_MONTH = properties.getProperty("CREDIT_CARD_MONTH");
        this.CREDIT_CARD_YEAR = properties.getProperty("CREDIT_CARD_YEAR");
        this.CREDIT_CARD_NAME = properties.getProperty("CREDIT_CARD_NAME");
        this.CREDIC_CARD_CVV2 = properties.getProperty("CREDIC_CARD_CVV2");
    }

}
