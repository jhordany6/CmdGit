package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class DriverChrome {

    private static String DriverChrome;
    WebDriver driver;

    public DriverChrome() {
        driver = getProxiedDriver();
    }


}
