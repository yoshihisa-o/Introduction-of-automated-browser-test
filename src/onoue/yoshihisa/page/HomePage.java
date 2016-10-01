package onoue.yoshihisa.page;


import org.openqa.selenium.*;

public class HomePage extends AbstractPage {    
    private static final String url = "http://edition.cnn.com/";
    
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    public String getUrl() {
        return url;
    }
    
    public WebElement buttonMenu() {
        return driver.findElement(By.id("menu"));
    }
    
    public WebElement buttonTechInMenu() {
        return driver.findElement(By.cssSelector("div.nav-flyout__menu-item.nav-flyout__menu-item--tech > a.nav-flyout__section-title"));
    }

}
