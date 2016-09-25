package onoue.yoshihisa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tech {
    private static final String url = "http://edition.cnn.com/tech";
    
    public static String getUrl() {
        return url;
    }
    public static WebElement titleTech(WebDriver driver) {
        return driver.findElement(By.className("zn-header__text-page_header"));
    }
}
