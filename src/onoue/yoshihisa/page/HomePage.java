package onoue.yoshihisa.page;

import org.openqa.selenium.*;

public class HomePage {    
    private static final String url = "http://edition.cnn.com/";
    
    public static String getUrl() {
        return url;
    }
    
    public static WebElement buttonMenu(WebDriver driver) {
        return driver.findElement(By.id("menu"));
    }
    
    public static WebElement buttonTechInMenu(WebDriver driver) {
        return driver.findElement(By.cssSelector("div.nav-flyout__menu-item.nav-flyout__menu-item--tech > a.nav-flyout__section-title"));
    }
}
